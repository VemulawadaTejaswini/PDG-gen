import java.util.Scanner;

public class Main {
    public static void main{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i=1;

            while(x!=0){

                System.out.print("Case " + i++ + ":" + x);
                x = sc.nextInt();
            }

        }
    }
