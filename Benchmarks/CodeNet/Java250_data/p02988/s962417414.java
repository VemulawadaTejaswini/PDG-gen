import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		int min=99999,sum=0;

		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=1;i<n-1;i++) {
			if(array[i]>array[i-1]&&array[i]<array[i+1])sum++;
			else if(array[i]<array[i-1]&&array[i]>array[i+1])sum++;
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


