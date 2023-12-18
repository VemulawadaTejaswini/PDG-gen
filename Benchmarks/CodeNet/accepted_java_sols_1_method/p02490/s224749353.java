import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a []= new int[2];
		while(sc.hasNext()){
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			if((a[0] | a[1]) == 0)break;
			Arrays.sort(a);
			System.out.println(a[0] + " " + a[1]);
		}
		
	}
}