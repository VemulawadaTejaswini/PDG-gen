import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer d[] = new Integer[n];
	int size = 101;
	int count = 0;

	for(int i=0;i<n;i++) {
		d[i]  = sc.nextInt();
	}
	Arrays.sort(d,Collections.reverseOrder());
	for(int i=0;i<n;i++) {
		if(size>d[i]) {
			size = d[i];
			count++;
		}
	}
	System.out.println(count);
	}
}