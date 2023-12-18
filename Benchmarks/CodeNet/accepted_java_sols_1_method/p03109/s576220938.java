import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] date = sc.next().split("/");
		int[] a=new int[3];
		int i=0;
		String ans="TBD";
		for(String str : date) {
			a[i]=Integer.valueOf(str);
			i++;
		}

		if(a[1]<4 || (a[1]==4 && a[2]<=30) ) {
			ans="Heisei";
		}
		System.out.println(ans);
	}
}