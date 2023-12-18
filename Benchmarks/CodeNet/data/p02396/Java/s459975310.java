import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int i;
        int n = 1;

        
        do {
            i = stdIn.nextInt();
            System.out.println("case "+n+": "+i);
            n++;
        } while(i != 0);
    }
}