import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner num = new Scanner (System.in);
        int x = num.nextInt();
        if(1 <= x || x <= 100){
        x = x*x*x;
        System.out.println(x);
        }
    }
}
