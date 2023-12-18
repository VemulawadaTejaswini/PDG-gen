import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int c = 1999900000, i = 0;
		int n[] = new int[c];
		n[0] =sc.nextInt();
		while(n[i] != 0){
			i++;
			n[i] = sc.nextInt();
		}
		for(int j = 0; j < i; j++){
			int sum = 0;
			while(n[j] >= 10){
				sum = sum + n[j]%10;
				n[j] = n[j]/10;
			}
			sum = sum + n[j];
			System.out.println(sum);
		}
	}
}