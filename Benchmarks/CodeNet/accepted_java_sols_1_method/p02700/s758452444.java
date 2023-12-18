import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int D = sc.nextInt();
      int aAtack = C / B;
      if (C % B != 0) aAtack += 1;
      int tAtack = A / D;
      if (A % D != 0) tAtack += 1;
      boolean isWin = aAtack <= tAtack; 
      String ans = "No";
        if(isWin) ans="Yes";
      System.out.println(ans);
    } 
}