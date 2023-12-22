
import java.util.Arrays;
import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list=new int[n];
		boolean flag = false;
		for(int i=0;i<n;i++)list[i]=sc.nextInt();
		Arrays.sort(list);
		for(int i=0;i<n-1;i++) {
			if(list[i]==list[i+1])flag=true;
		}
		if(flag)System.out.println("NO");
		else System.out.println("YES");
	}
}