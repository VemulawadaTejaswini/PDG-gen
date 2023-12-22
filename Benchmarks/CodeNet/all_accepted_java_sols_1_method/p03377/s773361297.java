import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int x = stdIn.nextInt();

        if(a + b >= x && a <= x)
                System.out.println("YES");
        else
            System.out.println("NO");
    }
}