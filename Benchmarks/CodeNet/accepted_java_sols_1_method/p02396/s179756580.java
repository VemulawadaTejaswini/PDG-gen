import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i = 1;
        while(x != 0) {
            System.out.println("Case " + Integer.toString(i) + ": " + Integer.toString(x));
            i++;
            x = scanner.nextInt();
        }
    }
}

