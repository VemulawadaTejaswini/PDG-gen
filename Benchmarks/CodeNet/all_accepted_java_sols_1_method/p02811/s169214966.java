import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
      	String ans ="Yes";
      	if(500*k < x){
          ans = "No";
        }
		System.out.println(ans);
		sc.close();
	}
}