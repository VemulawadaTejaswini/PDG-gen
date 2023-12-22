import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next()); //N
		int number[]= new int [n];
		int ans[] =new int [n];
		for(int i=0;i<n;i++) {
			number[i]= Integer.parseInt(sc.next()); 
		}
		int []sub =number.clone();
		sc.close();
		Arrays.sort(number);
		for(int k=0;k<n;k++) {
			if(sub[k]>=number[n/2]) {
				System.out.println(number[(n/2)-1]);
			}else
				System.out.println(number[(n/2)]);
		}
	}
}