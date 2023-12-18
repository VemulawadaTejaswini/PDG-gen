import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int i = 0;
              while(true){
                i++;
                int a = sc.nextInt();
                if(a == 0) break;
                else System.out.printf("Case %d: %d\n", i, a);
               
            }
            
             sc.close();
        }
}
