import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(a+b<2*c){
            System.out.println(a*x+b*y);
            return;
        }

        int needA = 0;
        int needB = 0;
        int needC = 0;
        if(x>y){
            needA = x-y;
            needC = 2*y;
            if(a*needA > 2*needA*c){
                needC += 2*needA;
                needA = 0;
            }else{
            }
        }else{
            needB = y-x;
            needC = 2*x;
            if(b*needB > 2*needB*c){
                needC += 2*needB;
                needB = 0;
            }else{
            }
        }
//        System.out.println(needA+" "+needB+" "+needC);
        System.out.println(needA*a+needB*b+needC*c);
    }
}