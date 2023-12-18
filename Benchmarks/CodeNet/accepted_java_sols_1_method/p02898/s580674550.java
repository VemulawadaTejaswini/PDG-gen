import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] Array = new int[n];
		int k = sc.nextInt();
		int count=0;
		for(int i = 0; i < n; i++) {
			Array[i] = sc.nextInt();
			if(Array[i]>=k) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
