import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
    int a = sc.nextInt();
    int c;
    //char[] a = sc.nextLine().toCharArray();
    if(h % a == 0){
      c = h/a;
    }
    else{
      c = h/a + 1;
    }
    System.out.println(c);
  }
}