import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		int [] array = new int [n];

		sc.nextLine();
        for (int i = 0; i < n-1; i++) {
        	int tmp = 0;
        	tmp = sc.nextInt();
        	array[tmp-1]++;
        }
        for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
        }
	}
}
