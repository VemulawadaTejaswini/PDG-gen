import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        int r = 0;
        if(a > b){
            if(a > c) {
                if (b > c) {
                    r = a;
                    a = c;
                    c = r;

                }else{
                    r = a;
                    a = b;
                    b = c;
                    c = r;
                }
            }else {
                r = a;
                a = b;
                b = r;
            }
        }else{
            if (a > c){
                r = a;
                a = c;
                c = b;
                b = r;
            }else{
                if(b > c){
                    r = b;
                    b = c;
                    c = r;
                }
            }
        }
        System.out.printf("%d %d %d\n",a,b,c);
    }
}

