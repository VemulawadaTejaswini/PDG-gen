import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String T = in.nextLine();
      int A = 0;

for (int count = 0; count < S.length(); count++){
 if(S.charAt(count) == T.charAt(count)){
  A = A +1 ;
 }
}

System.out.println(S.length()-A);
        }
    }