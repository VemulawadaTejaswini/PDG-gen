import java.util.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int max = 0;
        int temp = 0;
        for (int i =0; i<s.length(); i++) {
            if (
                 s.charAt(i) == 'A'
              || s.charAt(i) == 'C'
              || s.charAt(i) == 'G'
              || s.charAt(i) == 'T') {
                  temp++;
                  if (max < temp) {
                      max = temp;
                  }
              }
              else {
                  temp =0;
              }
        }
        System.out.println(max);
        sc.close();
    }
}