import static java.lang.System.in;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        while(true){
        int a = sc.nextInt();
        String k = sc.next();
        int b = sc.nextInt();

        String x = "+";
        String x2 = "-";
        String x3 = "*";
        String x4 = "/";
        String x5 = "?";

        if(k.equals(x)){
            System.out.println(a+b);
        }else if(k.equals(x2)){
            System.out.println(a-b);
        }else if(k.equals(x3)){
            System.out.println(a*b);
        }else if(k.equals(x4)){
            System.out.println(a/b);
        }else if(k.equals(x5)){
            break;
        }
    }
    }
}

