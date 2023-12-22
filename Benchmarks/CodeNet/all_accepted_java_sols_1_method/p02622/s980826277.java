import java.util.*;
    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t = sc.nextLine();
            int count=0;
            for (int i=1;i <= s.length(); i++) {
                if(!s.substring(i-1,i).equals(t.substring(i-1,i))){
                    count++;
                }
            }
          	System.out.println(count);
        }
    }