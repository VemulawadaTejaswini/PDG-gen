import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a= new int[n];
		String[] s=new String[n];
		int count=0,max=0;;

		for(int i=0;i<n;i++) {
			s[i]=sc.next();
		}
		Arrays.parallelSort(s);
		for(int i=0;i<n-1;i++) {
			if(s[i].equals(s[i+1])) {
				count++;
			}else {
				if(count!=0)count++;
				max=Math.max(count, max);
				count=0;
			}
		}
		if(count!=0) {
			count++;
			max=Math.max(count, max);
		}
		count=0;
		for(int i=0;i<n-1;i++) {
			if(s[i].equals(s[i+1])) {
				count++;
			}else {
				if(count!=0)count++;
				if(count==max) {
					System.out.println(s[i]);
				}
				count=0;
			}
		}
		if(count!=0)count++;
		if(count==max) {
			System.out.println(s[n-1]);
		}
		/*for(String buff:s) {
			System.out.println(buff);
		}
		System.out.println(max+" "+count);*/
	}
}

