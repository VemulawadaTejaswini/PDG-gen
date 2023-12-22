import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) != 'A') {
            System.out.println("WA");
        } else {
            int flag = 0;
            int count = 0;
            for (int i=2; i<s.length()-1; i++) {
                if (s.charAt(i)=='C') count++;
            }
            if (count != 1) {
                System.out.println("WA");
            } else {
                for (int i=1; i<s.length(); i++) {
                    if (s.charAt(i) != 'C') {
                        int z = Integer.valueOf(s.charAt(i));
                        if (z<97 || z > 122) {
                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag==1) System.out.println("WA");
                else System.out.println("AC");
            }
        }
     }
}