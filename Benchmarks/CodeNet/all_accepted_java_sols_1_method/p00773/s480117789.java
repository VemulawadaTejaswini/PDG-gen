import java.util.Scanner;

//https://onlinejudge.u-aizu.ac.jp/problems/1192
public class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (true) {
	  int max = 0;
	  int x = sc.nextInt();
	  int y = sc.nextInt();
	  int s = sc.nextInt();
	  
	  if (x == 0 && y == 0 && s == 0) break;
	  for (int i = 1; i < s; i++) {
		for (int j = 1; j < s; j++) {
		  int taxFistProduct1 = ((i * 100) + (i * x)) / 100;
		  int taxFistProduct2 = ((j * 100) + (j * x)) / 100;
		  
		  if (s == taxFistProduct1 + taxFistProduct2) {
			int taxSecondProduct1 = ((i * 100) + (i * y)) / 100;
			int taxSecondProduct2 = ((j * 100) + (j * y)) / 100;
			
			if (max <= taxSecondProduct1 + taxSecondProduct2) {
			  max = taxSecondProduct1 + taxSecondProduct2;
			}
		  }
		}
	  }
	  System.out.println(max);
	}
  }
}
