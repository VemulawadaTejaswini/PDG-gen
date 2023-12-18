import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = a % 1000;
      	if(b == 0){
          System.out.println(b);   
        }else{
          System.out.println(1000 - b);             
        }

    }
}