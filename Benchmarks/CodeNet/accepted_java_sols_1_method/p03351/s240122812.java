import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	int d = sc.nextInt();
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);
      	if(ac <= d){
            System.out.println("Yes");   
        }else if(ab <= d && bc <= d){
            System.out.println("Yes");   
        }else{
            System.out.println("No");   
        }


    }
}