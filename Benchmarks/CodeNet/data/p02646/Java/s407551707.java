import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
      
        if(v * t - w * t >= b - a){
			System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}