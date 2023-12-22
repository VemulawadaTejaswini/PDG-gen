import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
      	String result = "";
		int battleCount = 0;

      	while(a > 0 && c > 0){
          battleCount += 1;
          if(battleCount % 2 == 0){
            a -= d;
          }
          else{
            c -= b;
          }
        }

		result = battleCount % 2 == 0 ? "No" : "Yes";
		System.out.println(result);
    }
}