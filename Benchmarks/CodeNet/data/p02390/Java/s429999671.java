import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int y=x%3600;
    System.out.print(x/3600 + ":" + y/60 + ":" + y%60);
    }
}
