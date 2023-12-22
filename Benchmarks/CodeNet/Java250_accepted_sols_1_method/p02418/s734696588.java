import java.io.*;
import java.util.*;
  
class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = s1 + s1;
            if (s3.contains(s2)) {
                    System.out.println("Yes");
            }else{
                    System.out.println("No");
            }
        }
}