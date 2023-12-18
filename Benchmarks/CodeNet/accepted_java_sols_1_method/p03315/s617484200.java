import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String e[] = sc.nextLine().split("");
    int count = 0;
    for (int i = 0 ; i < e.length; i++){
        if(e[i].equals("+"))  count++;    
    }
    System.out.println(2*count-4);
  }
}