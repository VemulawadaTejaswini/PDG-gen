import java.util.Scanner;
import java.util.Stack;

class P{
	int z,y,x;
	P(int z,int y,int x){
		this.z=z;
		this.y=y;
		this.x=x;
	}
}

public class Main {
	int box[][][]=new int[5][5][5];
	Stack<P> bs=new Stack<P>();
	Stack<P> ds=new Stack<P>();
	public static void main(String[] args) {
		//new AOJ1519().run();
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		int count=1;
		while(true){
			char ch[][]=new char[5][5];
			int n=sc.nextInt();
			if(n==0) break;

			if(count!=1) System.out.println();
			
			for(int i=0; i<5; i++){
				for(int j=0; j<5; j++){
					ch[j]=sc.next().toCharArray();
					for(int k=0; k<5; k++){
						box[i][j][k]=(ch[j][k]-'0');
					}
				}
			}
			int m1=sc.nextInt();
			int a[]=new int[m1];
			for(int i=0;i<m1;i++){
				a[i]=sc.nextInt();
			}
			int m2=sc.nextInt();
			int b[]=new int[m2];
			for(int i=0;i<m2;i++){
				b[i]=sc.nextInt();
			}
			
			//ここから本番
			for(int day=0; ; day++){
				//誕生
				while(!bs.isEmpty()){
					P p=bs.pop();
					box[p.z][p.y][p.x]=1;
				}
				//死滅
				while(!ds.isEmpty()){
					P p=ds.pop();
					box[p.z][p.y][p.x]=0;
				}
				
				if(n <= day) break;
				
				for(int i=0; i<5; i++){
					for(int j=0; j<5; j++){
						for(int k=0; k<5; k++){
							if(box[i][j][k]==0){
								//誕生するかチェック
								born_check(i, j, k, m1, a);
							}
							else{
								//死ぬかチェック
								death_check(i, j, k, m2, b);
							}
						}
					}
				}
				
			}//day
			System.out.println("Case "+count+":");
			print();
			count++;
		}
	}
	
	void born_check(int z,int y,int x,int m1,int a[]){
		int sum=0;
		for(int i=-1; i<=1; i++){
			for(int j=-1; j<=1; j++){
				for(int k=-1; k<=1; k++){
					if(0<=z+i && 0<=y+j && 0<=x+k && z+i<5 && y+j<5 && x+k<5 && !(i==0 && j==0 && k==0)){
						sum+=box[z+i][y+j][x+k];
					}
				}
			}
		}
		for(int i=0;i<m1;i++){
			if(sum==a[i]){
				bs.add(new P(z, y, x));
				break;
			}
		}
		return;
	}

	void death_check(int z,int y,int x,int m2,int b[]){
		int sum=0;
		for(int i=-1; i<=1; i++){
			for(int j=-1; j<=1; j++){
				for(int k=-1; k<=1; k++){
					if(0<=z+i && 0<=y+j && 0<=x+k && z+i<5 && y+j<5 && x+k<5 && !(i==0 && j==0 && k==0)){
						sum+=box[z+i][y+j][x+k];
					}
				}
			}
		}
		for(int i=0;i<m2;i++){
			if(sum==b[i]){
				return;
			}
		}
		ds.add(new P(z, y, x));
		return;
	}
	void print(){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				for(int k=0; k<5; k++){
					System.out.print(box[i][j][k]);
				}
				System.out.println();
			}
			if(i!=4) System.out.println();
		}
	}
}