import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String N = sc.next();
        char[] n = N.toCharArray();
        int nine = 0;
        for(int i = 0; i < N.length(); i++){
          nine += Character.getNumericValue(n[i]);
        }
        String ans = "Yes";
      if(nine % 9 != 0 ) ans = "No";
      System.out.println(ans);
    } 
}