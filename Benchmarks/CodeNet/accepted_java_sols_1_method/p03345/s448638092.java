import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        long k = scan.nextLong();
        if(k%2==0)System.out.println(a-b);
        else System.out.println(b-a);
    }
}