import java.util.Scanner;

class Main{
	public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      final int N = sc.nextInt();
      
      System.out.println((double)(N - N / 2) / N);
	}
}
