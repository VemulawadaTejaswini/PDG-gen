import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		Scanner sc=new Scanner(System.in);
		long a[]=new long[3],m[]=new long[3];
		long g1,g2,l1,l2,g3,l3;
		int i,count[]=new int[3];
		while(true){
			for(i=0;i<3;i++){
				a[i]=sc.nextLong();
				m[i]=sc.nextLong();
			}
			if(a[0]==0 && a[1]==0 && a[2]==0 && m[0]==0 && m[1]==0 && m[2]==0) break;
			for(i=0;i<3;i++){
				count[i]=mcount(a[i],m[i]);
			}
			
			g1=gcd(count[0],count[1]);
			l1=count[0]*count[1]/g1;
			
			g2=gcd(count[1],count[2]);
			l2=count[1]*count[2]/g2;
			
			g3=gcd(l1,l2);
			l3=l1*l2/g3;
			System.out.println(l3);
		}
	}
	static long gcd(long a,long b){
		if(b==0){
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}
	static int mcount(long a,long m){
		int count=0;
		long x=1;
		while(true){
			x=(a*x)%m;
			count++;
			if(x==1) break;
		}
		//System.out.println(count);
		return count;
	}

}