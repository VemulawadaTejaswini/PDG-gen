import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long a = 0;
        a = n / 500;
        n = n % 500;
        n = n / 5;
        n = n * 5;
        a = a * 1000;
        System.out.println(a + n);
    } 
}