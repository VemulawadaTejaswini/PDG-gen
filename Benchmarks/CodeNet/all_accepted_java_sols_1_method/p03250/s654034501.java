import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a=new int[3];
		for(int i=0;i<3;i++) {
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		String s="";
		for(int i=2;i>0;i--) {
			s+=a[i];
		}
		System.out.println(Integer.parseInt(s)+a[0]);
	}

}
