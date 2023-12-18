import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int [3];
		a[0]=scan.nextInt();
		a[1]=scan.nextInt();
		a[2]=scan.nextInt();
		int b=scan.nextInt();
		for(int i=0;i!=b;i++) {
			Arrays.sort(a);
			a[2]*=2;
		}
		int ans=0;
		for(int i=0;i!=3;i++) {
			ans+=a[i];
		}
		System.out.println(ans);
	}
	}
