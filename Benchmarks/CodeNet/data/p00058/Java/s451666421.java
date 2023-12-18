import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			double[] a=new double[8];
			for(int i=0;i<8;i++)a[i]=sc.nextDouble();
			a[0]-=a[2]; a[1]-=a[3];
			a[4]-=a[6]; a[5]-=a[7];
			if(a[0]*a[4]+a[1]*a[5]==0)System.out.println("YES");
			else System.out.println("NO");
			
		}
	}
}