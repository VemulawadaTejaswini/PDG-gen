import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int i = 0;
        int x, y, z;
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            while(true){
                if(a == b && b == c && c == a){
                    System.out.print(-1);
                    break;
                }
                else if(a % 2 != 0 || b % 2 != 0 || c % 2 != 0){
                    System.out.print(i);
                    break;
                }
                else{
                    x = a / 2;
                    y = b / 2;
                    z = c / 2;

                    a = y + z;
                    b = x + z;
                    c = x + y;

                    i++;
                }
            }
        }
        else{
            System.out.print(i);
        }
    }
}