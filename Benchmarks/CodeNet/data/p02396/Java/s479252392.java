
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            int i=1;
        while(true){
        Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();

                  if(x==0){
                      break;
                   }else{
                      System.out.printf("Case %d: %d",i,x);
                      i++;
                  }
            }
            System.out.printf("/n");
    }
    }
