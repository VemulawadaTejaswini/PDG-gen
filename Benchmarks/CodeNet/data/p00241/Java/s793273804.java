
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N=cin.nextInt();
			if(N==0){
				break;
			}
			while(N--!=0){
				Qua[] a = new Qua[4];
				Qua[] b = new Qua[4];
				for(int i = 0;i<4;i++){
					int c = cin.nextInt();
					a[i]=new Qua(c,i);
				}
				for(int i = 0;i<4;i++){
					int c = cin.nextInt();
					b[i]=new Qua(c,i);
				}
				Qua[] c = new Qua[16];
				int cnt=0;
				for(int i = 0;i<4;i++){
					for(int j = 0;j<4;j++){
						c[cnt++]=a[i].mult(b[j]);
					}
				}
				for(int i = 0;i<4;i++){
					int ans=0;
					for(int j = 0;j<16;j++){
						if(i==c[j].type){
							ans+=c[j].num;
						}
					}
					if(i==0){
						System.out.print(ans);
					}
					else{
						System.out.print(" "+ans);
					}

				}
				System.out.println();
			}
		}
	}

}
class Qua{
	int num;
	int type;
	Qua(int a,int b){
		num=a;type=b;
	}
	public String toString(){
		return ""+num+" " +type;
	}
	Qua mult(Qua q){
		Qua res=new Qua(this.num,this.type);
		res.num=res.num*q.num;
		if(res.type==0&&q.type==0){
			return res;
		}
		if(res.type==q.type){
			res.type=0;
			res.num*=-1;
			return res;
		}
		if(res.type==0){
			res.type=q.type;
			return res;
		}
		if(q.type==0){
			return res;
		}
		if(res.type==1){
			if(q.type==2){
				res.type=3;
			}
			else if(q.type==3){
				res.type=2;
				res.num*=-1;
			}
			return res;
		}
		if(res.type==2){
			if(q.type==1){
				res.type=3;
				res.num*=-1;
			}
			else if(q.type==3){
				res.type=1;
			}
			return res;
		}
		if(res.type==3){
			if(q.type==1){
				res.type=2;
			}
			else if(q.type==2){
				res.type=1;
				res.num*=-1;
			}
			return res;
		}
		return res;
	}
}