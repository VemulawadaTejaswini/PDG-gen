import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			max=Math.max(a[i],max);
		}
		Arrays.parallelSort(a);

		int c=0;
		for(int x=0;x<n;x++) {
			for(int y=x+1;y<n;y++) {

				for(int z=y+1;z<n;z++) {
					if(a[z]<a[x]+a[y])
						c++;
					else
						break;

				}

			}
		}
		System.out.println(c);

	}

}
