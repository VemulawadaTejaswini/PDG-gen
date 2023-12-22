import java.util.*;

public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    String D_T_S [] = new String[3];
    String line = sc.nextLine();
    
    D_T_S = line.split(" ", 0);
    int D = Integer.parseInt(D_T_S[0]);
    int T = Integer.parseInt(D_T_S[1]);
    int S = Integer.parseInt(D_T_S[2]);
    
    if(D > T * S){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}