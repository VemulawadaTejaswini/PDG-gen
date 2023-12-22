import java.util.Scanner;

public class Main
{
    public static int gcd(int x, int y) {
        int max, min, temp;
        if(x > y){
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }
        
        while(true){
            if(max % min == 0){
                return min;
            } else {
                temp = max % min;
                max = min;
                min = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(gcd(x, y));
    }
}

