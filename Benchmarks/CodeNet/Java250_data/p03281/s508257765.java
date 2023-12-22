import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int yono = 0;
                if(n >= 165) yono++;
                if(n >= 105) yono++;
                if(n >= 195) yono++;
                if(n >= 135) yono++;
                if(n >= 189) yono++;
                sc.close();
                System.out.println(yono);
        }
}