import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();      
		
      	if(a / c <= b){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }
}