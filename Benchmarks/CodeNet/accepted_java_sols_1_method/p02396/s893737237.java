import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i=1;
        int x;
        while (i != 0) {
            x = sc.nextInt();
            if(x == 0) break;
            System.out.println("Case " + i + ": " + x);
            i++;
        }
        sc.close();
    }
}
