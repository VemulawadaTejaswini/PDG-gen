import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner InData = new Scanner(System.in);
    int a = InData.nextInt();
    int b = InData.nextInt();
    int c = InData.nextInt();
    if(a>=b || b>=c)
        System.out.println("No");
    else
        System.out.println("Yes");
    }
}