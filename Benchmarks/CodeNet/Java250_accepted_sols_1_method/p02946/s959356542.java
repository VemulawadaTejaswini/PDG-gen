import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	// スペース区切りの整数の入力
	int a = sc.nextInt();
	int b = sc.nextInt();
    int max = b + (a - 1);
    int min = b - (a - 1);
    for(int i = min; i < max; i++){
    	System.out.print(i + " ");
    }
    System.out.println(max);
  }
}