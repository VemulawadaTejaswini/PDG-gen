import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while(sc.hasNext()) {
            int  a = sc.nextInt();
            int b = sc.nextInt();
            int x,y;
            int temp = 0;
            if (a < b) {
                x = b;
                y = a;
            } else {
                x = a;
                y = b;
            }
            while(b != 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println(a + " " + (x * (y / a)));
        }
    }
}