import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int a = Integer.parseInt(sc.next());
                String s = sc.next();
                String ans = "No";
                int count = 0;
                char c = 'R';
                for(char x:s.toCharArray()){
                  if(x == c){
                    count++;
                  }
                }
                if(count>a-count) ans = "Yes";
                System.out.println(ans);
            }
        }
    }
}