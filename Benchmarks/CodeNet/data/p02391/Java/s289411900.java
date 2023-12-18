import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner InData = new Scanner(System.in);
    int a = InData.nextInt();
    int b = InData.nextInt();
    if(a==b)
        System.out.println("a == b");
    else if(a>b)
        System.out.println("a > b");
    else
        System.out.println("a < b");
    }
}