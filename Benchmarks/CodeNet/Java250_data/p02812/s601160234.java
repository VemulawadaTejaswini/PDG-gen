import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int[] array=new int[n];
		int min=99999,sum=0;

		for(int i=0;i<n-2;i++) {
			if(s.substring(i,i+3).equals("ABC"))sum++;
		}

		System.out.println(sum);


	}
}
/*
 6
khabarovsk 20
moscow 10
kazan 50
kazan 35
moscow 60
khabarovsk 40
 */

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


