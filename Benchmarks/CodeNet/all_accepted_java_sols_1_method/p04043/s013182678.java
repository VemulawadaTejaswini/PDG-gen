import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	
      	// A B Cに5が二つ 7が1つ含まれている場合のみ
      	// A * B * C = 5 * 5 * 7 = 175 になる
      	int product = 175;
      	
      	// A * B * C = productと一致するか判定
      	if(A * B * C == product) {
        	System.out.println("YES");
        } else {
         	System.out.println("NO");
        }
	}  
}