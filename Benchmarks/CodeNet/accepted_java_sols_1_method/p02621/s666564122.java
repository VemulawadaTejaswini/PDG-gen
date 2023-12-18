import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		// 整数の入力
	int a = sc.nextInt();
    
    if(a>=0 && a<=10) System.out.println(a+a*a+a*a*a);
  }
}