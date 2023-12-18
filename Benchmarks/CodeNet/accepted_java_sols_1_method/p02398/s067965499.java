import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        int count = 0;
        for(int divisor = a; divisor <= b; divisor++){
            if(c % divisor == 0){ count++; }
        }
        System.out.println(count);
    }
}
