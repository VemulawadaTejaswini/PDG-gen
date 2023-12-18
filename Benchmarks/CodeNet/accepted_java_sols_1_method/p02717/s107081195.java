import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int changeValue;
        changeValue = x;
        x = y;
        y = changeValue;
        changeValue = x;
        x = z;
        z = changeValue;
        System.out.printf("%d %d %d",x,y,z);
    }
}