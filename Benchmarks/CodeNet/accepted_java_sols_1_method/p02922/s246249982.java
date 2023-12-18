import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
	int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int unuse = 1;
    int count = 0;
    
    while(unuse < b){
      unuse--;
      unuse += a;
      count++;
    }
    
    System.out.println(count);
    
  }
}