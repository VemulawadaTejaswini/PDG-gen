import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();

        if(Math.pow(2,x)==y)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
