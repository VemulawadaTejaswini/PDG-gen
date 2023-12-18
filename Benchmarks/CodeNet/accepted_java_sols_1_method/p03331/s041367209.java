import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1,b = n - a;
        int min = Integer.MAX_VALUE;
        while (a <= b){
            char[] acr = String.valueOf(a).toCharArray();
            char[] bcr = String.valueOf(b).toCharArray();
            int t = 0;
            for (char ac:acr){
                t += Integer.valueOf(String.valueOf(ac));
            }
            for (char bc:bcr){
                t += Integer.valueOf(String.valueOf(bc));
            }
            min = min > t ? t : min;
            ++a;
            --b;
        }
        System.out.println(min);
    }
}
