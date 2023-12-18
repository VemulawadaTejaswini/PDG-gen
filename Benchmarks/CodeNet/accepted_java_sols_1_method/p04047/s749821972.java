import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
//		System.out.println(str1);
//		System.out.println(str2);
		
		int N = Integer.parseInt(str1);
		String[] num = str2.split(" ", 0);
		
		int[] a = new int[num.length];
		
		for(int i=0;i<num.length; i++){
			a[i]= Integer.parseInt(num[i]);
		}
		Arrays.sort(a);
		
//		System.out.println(Arrays.toString(a));
		
		int j=0;
		for(int i = 0; i<a.length; i=i+2){
			j = j+a[i];
		}
		
		System.out.println(j);
		
		
		
		
//		System.out.println(num[0]);


	}
}
