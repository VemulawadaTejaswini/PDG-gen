import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int a = sc.nextInt();
        int taxi = sc.nextInt();
        int train,ans;

      	train = n * a;
        if(train >= taxi){
          System.out.println(taxi);
        }else{
          System.out.println(train);
        }
    }
}