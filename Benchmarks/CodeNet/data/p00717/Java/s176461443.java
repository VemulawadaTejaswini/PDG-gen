
import java.util.Scanner;

class V{
	int x,y;
	V(int x1,int y1,int x2,int y2){
		this.x=x2-x1;
		this.y=y2-y1;
	}
	boolean eq(int x1,int y1){
		if(this.x==x1 && this.y==y1) return true;
		else return false;
	}
}

public class Main {

	static V var0[];
	static V var1[];
	static V var[];
	static int px[],py[];
	static boolean flag;
	static int count;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m0,m,i,j;


		while(true){
			count=1;
			n=sc.nextInt();
			if(n==0) break;
			m0=sc.nextInt();
			px=new int[m0];
			py=new int[m0];
			for(i=0;i<m0;i++){
				px[i]=sc.nextInt();
				py[i]=sc.nextInt();
			}
			var0=new V[m0-1];
			var1=new V[m0-1];
			for(i=1;i<m0;i++){
				var0[i-1]=new V(px[i-1],py[i-1],px[i],py[i]);
			}
			//けつ追い
			j=0;
			for(i=m0-1;0<i;i--){
				var1[j]=new V(px[i],py[i],px[i-1],py[i-1]);
				j++;
			}

			for(i=0;i<n;i++){
				m=sc.nextInt();
				px=new int[m];
				py=new int[m];
				for(j=0;j<m;j++){
					px[j]=sc.nextInt();
					py[j]=sc.nextInt();
				}
				flag=false;
				for(int k=0;k<4;k++){
					var=new V[m-1];
					for(j=1;j<m;j++){
						var[j-1]=new V(px[j-1],py[j-1],px[j],py[j]);
					}
					check(m0,m);
					check1(m0,m);
					turn(m);
				}
				if(flag){
					System.out.println(count);
				}
				count++;
			}//i for
			System.out.println("+++++");
		}//while

	}//main
	static void check(int m0,int m){
		int i;
		if(flag) return;
		if(m0!=m){
			flag=false;
			return;
		}
		for(i=0;i<m-1;i++){
			if(!var0[i].eq(var[i].x, var[i].y)){
				flag=false;
				break;
			}
		}
		if(i==m-1) flag=true;;
	}
	static void check1(int m0,int m){
		int i;
		if(flag) return;
		if(m0!=m){
			flag=false;
			return;
		}
		for(i=0;i<m-1;i++){
			if(!var1[i].eq(var[i].x, var[i].y)){
				flag=false;
				break;
			}
		}
		if(i==m-1) flag=true;;
	}
	static void turn(int m){
		int i,temp;
		for(i=0;i<m;i++){
			temp=px[i];
			px[i]=(-1*py[i]);
			py[i]=temp;
		}
	}
}