import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int A,B,C,X,count;
		count = 0;
		Scanner input = new Scanner(System.in);
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		X = input.nextInt();
		
		for(int a = 0; a<=A;a++) {
			for(int b = 0; b<=B;b++) {
				for(int c = 0; c<=C;c++) {
					if((a*500 + b*100 + c*50) == X) count++;
				}
			}
		}
		System.out.println(count);
	}

}