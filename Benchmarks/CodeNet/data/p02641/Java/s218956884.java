import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        String line = scan.nextLine();

        line = scan.nextLine();

        if (n ==0){
            System.out.println(x);
        }
        for(int i=0; i < n; i++){
            if (!line.contains(String.valueOf(x - i))){
                System.out.println( x - i);
                break;
            }else if (!line.contains(String.valueOf(x + i))){
                System.out.println( x + i);
                break;
            }
        }

    }
}
