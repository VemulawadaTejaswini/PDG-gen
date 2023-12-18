import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()*100;
        int b = sc.nextInt()*10;
        int c = sc.nextInt();
        int x = a+b+c;
        int z = x%4;
        System.out.println(z==0 ? "YES" : "NO");
    }
}