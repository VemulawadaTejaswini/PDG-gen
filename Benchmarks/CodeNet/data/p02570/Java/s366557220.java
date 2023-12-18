import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();
      
      	if (D/S >= S){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
	}
}