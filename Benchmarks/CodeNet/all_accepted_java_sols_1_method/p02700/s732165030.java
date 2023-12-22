import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
      	while(true){
          if(c - b <= 0){
              System.out.println("Yes");  
              break;
          }else{
              c -= b;
          }          
          
          if(a - d <= 0){
              System.out.println("No");  
              break;
          }else{
              a -= d;
          }
        }
    }
}