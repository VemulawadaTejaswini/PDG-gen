import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Integer a[] = new Integer[n];
	int x= 0;
	int y= 0;

	for(int i=0;i<n;i++) {
		a[i]  = sc.nextInt();
	}
	Arrays.sort(a, Collections.reverseOrder());
	try{
	for(int i=0;i<n;i+=2) {
		x += a[i];
	}
	for(int i=1;i<n;i+=2) {
		y += a[i];
	}
	}catch(Exception e) {

	}
	System.out.println(x-y);
	}
}