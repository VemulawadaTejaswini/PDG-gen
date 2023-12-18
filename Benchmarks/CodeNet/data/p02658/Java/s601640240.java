import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
       	int b = 0;
      
    	for (int i = 0; i < a; i++) {
          	if (i == 0) {
              b = sc.nextInt();
            } else {
               b *= sc.nextInt(); 
            }
        }
		// 出力
		System.out.println(b);
	}
}