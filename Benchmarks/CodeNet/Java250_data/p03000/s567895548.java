import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] array=new int[n];
		int f=0,count=1;

		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++) {
			f=f+array[i];
			if(f>x) {
				break;
			}
			count++;
		}
		System.out.println(count);


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


