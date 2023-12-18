import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int a = cin.nextInt();
        int b = cin.nextInt();

        if(a <= 9 && b <= 9) {
            System.out.print(a*b);
        }
        else {
            System.out.print(-1);
        }
        
        System.out.println();
    }

}