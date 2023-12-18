import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
	//int a = sc.nextInt();
    char[] a = sc.nextLine().toCharArray();
    char[] b = sc.nextLine().toCharArray();
    int count = 0;
    for(int i = 0; i < 3; i++){
      if(a[i] == b[i]){
        count++;
      }
    }
    System.out.println(count);
  }
}