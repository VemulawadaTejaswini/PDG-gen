import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x;
        int count = 1;

        while (true){
            x = Integer.parseInt(scan.next());

            if (x == 0)
                break;
            System.out.println("Case " + count + ": " + x);
            count += 1;
        }
    }
}