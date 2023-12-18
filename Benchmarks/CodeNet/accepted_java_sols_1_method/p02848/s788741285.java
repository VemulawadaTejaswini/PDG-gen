import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String str = sc.nextLine();
    char[] c = str.toCharArray();
    for(int i = 0; i < str.length(); i++){
      c[i] += N;
      if(c[i] > 'Z'){
        c[i] -= 26;
      }
    }
    System.out.println(new String(c));
  }
}
    
    