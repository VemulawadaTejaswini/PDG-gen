
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String x = sc.next();
            int n = sc.nextInt();
            for(int i=0 ; i < n ; i++){
                String order = sc.next();
                if(order.equals("print")){
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(x.substring(a,b+1));
                }else if(order.equals("reverse")){
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    char y[] = new char[b-a+1];
                    for(int j=0 ; j < b-a+1 ; j++){
                        y[j] = x.charAt(b-j);
                    }
                    x = x.substring(0,a) + String.valueOf(y) + x.substring(b+1,x.length());
                }else if(order.equals("replace")){
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    String c = sc.next();
                    x = x.substring(0,a) + c + x.substring(b+1,x.length());
                }
            }
    }
}

