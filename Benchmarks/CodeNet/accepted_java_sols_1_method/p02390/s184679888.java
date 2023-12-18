import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = x/3600;
        int b = (x-3600*a)/60;
        int c = x%60;
        System.out.println(a+":"+b+":"+c);
    }
}
