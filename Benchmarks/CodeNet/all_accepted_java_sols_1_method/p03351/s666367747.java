import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
      	//絶対値を用いる
      	int num1 = Math.abs(a-b);
      	int num2 = Math.abs(b-c);
      	int num3 = Math.abs(a-c);
      
      	if(num1 <=d && num2 <=d){
          System.out.println("Yes");
        }else if(num3 <=d){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
     }
}