import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] t=new int[100];
		int[] m=new int[100];
		int[] sm=new int[100];
		int k=0;
		for(int i=0;i<a;i++) {
		    int b= sc.nextInt();
		    t[i]=b;
		}
		int c = sc.nextInt();
		for(int i=0;i<c;i++) {
		    int b= sc.nextInt();
		    int d= sc.nextInt();
		    int s=t[b-1];
		    t[b-1]=d;
		    int sum=0;
		    for(int j=0;j<a;j++) {
		    	   sum+=t[j];
		    }
		    sm[k]=sum;
		    k++;
		    t[b-1]=s;
		}
		for(int i=0;i<k;i++) {
			System.out.println(sm[i]);
			
		}
	}
}