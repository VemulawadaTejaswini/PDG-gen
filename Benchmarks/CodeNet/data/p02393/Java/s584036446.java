import java.util.Scanner;

public class Main{
    public static void Sort(int x, int y, int z){
        int w;
        if(x > y){
            w = x;
            x = y;
            y = w;
        }
        if(y > z){
            w = y;
            y = z;
            z = w;
        }
        if(x > y){
            w = x;
            x = y;
            y = w;
        }
        System.out.println(x + " " + y + " " + z);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Sort(a, b, c);
    }
}
