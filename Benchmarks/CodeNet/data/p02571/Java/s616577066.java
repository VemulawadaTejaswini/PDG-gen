import java.util.Scanner;

public class Main {
  
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();


        int changeCount = 1001;

        for (int i = 0; i <= S.length() - T.length(); i++) {

            int count = 0;
            for (int j = 0; j < T.length(); j++) {


                if (T.charAt(j) != S.charAt(i + j)){
                    count++;
                }
            }

            if (count < changeCount) {
                changeCount  = count;
            }
        }
        System.out.println(changeCount);
    }
}