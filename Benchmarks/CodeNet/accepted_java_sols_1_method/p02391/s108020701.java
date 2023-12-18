import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());

        if (a > b)
            System.out.println("a > b");
        else if (a < b)
            System.out.println("a < b");
        else
            System.out.println("a == b");
    }
}