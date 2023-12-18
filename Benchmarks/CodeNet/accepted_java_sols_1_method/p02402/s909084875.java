import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	public static void main (String[] args){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int n=sc.nextInt();
		int[] a=new int[n];
		a[0]=sc.nextInt();
		int min=a[0],max=a[0];
                long sum=a[0];
		for(int i=1;i<n;i++){
			a[i]=sc.nextInt();
			if(min>a[i]) min=a[i];
			if(max<a[i]) max=a[i];
			sum+=a[i];
		}
		sc.close();
		System.out.println(min+" "+max+" "+sum);
	}
}