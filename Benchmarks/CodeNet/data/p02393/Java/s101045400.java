import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp;
        if(a > b){
            tmp = b;
            b = a;
            a = tmp;
        }
        if(a > c){
            tmp = c;
            c = a;
            a = tmp;
        }
        if(b > c){
            tmp = c;
            c = b;
            b = tmp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
