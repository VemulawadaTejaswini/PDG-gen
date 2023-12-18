import java.util.Scanner;

public class Main {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt(), b = sc.nextInt();
            if (a == 0 && b == 0)
                break;
            if(a>b) {
                a+=b;
                b=a-b;
                a-=b;
            }
            System.out.println(a+" "+b);
        }    
    }
}
