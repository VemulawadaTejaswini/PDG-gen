import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        for( ; ; ){
            String x = sc.next();
            if(x.equals("-")){
                 break;
            }
            for(int n = sc.nextInt() ; n > 0; n--){
                int a = sc.nextInt();
                x = x.substring(a) + x.substring(0,a);
            }
            System.out.println(x);
        }
        sc.close();
    }
}
