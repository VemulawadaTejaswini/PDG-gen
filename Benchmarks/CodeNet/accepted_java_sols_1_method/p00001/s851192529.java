import java.util.*;
import java.util.Arrays;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int []a=new int [10];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=9;i>6;i--){
			System.out.println(a[i]);
		}
		

 }
}