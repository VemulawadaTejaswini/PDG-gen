import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        
        System.out.printf("%d %d", a*b, (a+b)*2);    
    }
}
