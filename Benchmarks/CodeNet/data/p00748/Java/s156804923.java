import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	static int N,min,cnt;
	static int[] a =new int[180];
	static int[] b =new int[45];
	static int[] alreadyA;
	static int[] alreadyB;
	static{
		int cnt=0;
		for(int i = 1;tetrahedral(i)<=1000000;i++){
			int t = tetrahedral(i);
			a[cnt++]=t;
		}
		for(int i = 0;i<a.length;i++){
			//System.out.println(a[i]);
		}		
		alreadyA=new int[1000000];
		alreadyB=new int[1000000];
		cnt=0;
		for(int i = 1;tetrahedral(i)<=1000000;i++){
			int t = tetrahedral(i);
			if(t%2==1){
				b[cnt++]=t;
			}
		}

	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Arrays.fill(alreadyA, 0);
		Arrays.fill(alreadyB, 0);
		a();
		while(true){
			N =cin.nextInt();
			if(N==0){
				break;
			}
			cnt=0;min=Integer.MAX_VALUE;
			
			System.out.print(alreadyA[N]);
			System.out.println(" "+alreadyB[N]);
		}

	}
	static void a(){
		for(int i= 1;i<1000000;i++){
			int mina=Integer.MAX_VALUE;
			int minb=Integer.MAX_VALUE;
			int x=0,y=0;
			for(int j=0;j<180&&a[j]<=i;j++){
				mina=Math.min(1+alreadyA[i-a[j]],mina);
				if(a[j]%2==1){
					minb=Math.min(1+alreadyB[i-a[j]],minb);
				}
			}
			//System.out.println(i+" " +x+" " +y + " " +min);
			alreadyA[i]=mina;
			alreadyB[i]=minb;
		}
	}
	static int tetrahedral(int a){
		return (a*(a+1)*(a+2))/6;
	}
}