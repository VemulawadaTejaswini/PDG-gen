import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int size = sc.nextInt();
    int zero = sc.nextInt();
    int min = zero;
    int max = zero;
    for(int i = 1; i < size; i++){
      int a = sc.nextInt();
      if(a < min){
        min = a;
      }
      if(a > max){
        max = a;
      }
    }
    System.out.println(max - min);
	}
}