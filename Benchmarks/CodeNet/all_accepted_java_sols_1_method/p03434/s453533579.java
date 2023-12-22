import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int s1=0;
		int s2=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i=i+2){
			s1=s1+a[i];
		}
		for(int i=1;i<n;i=i+2){
			s2=s2+a[i];
		}
		System.out.println(Math.abs(s2-s1));
	}

}