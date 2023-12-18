import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String p = sc.nextLine();
      String ss = s + s;
      int OK = 0;
      int[] check = new int[s.length()];
      for(int i = 0; i < s.length(); i++){
        for(int j = 0; j < p.length(); j++){
          char pj = p.charAt(j);
          char ssj = ss.charAt(j+i);
          if (pj == ssj) check[i] ++; 
        }
      }
      for (int i = 0; i < s.length(); i++) {
        if (check[i] == p.length()) {
        System.out.println("Yes");
        OK = 1;
        break;
        }
      }
      if (OK == 0) System.out.println("No");
    }
}
