import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String[] command = str.split(" ");

        String order = scan.nextLine();
        char[] cOrder = order.toCharArray();
        for(int i = 0; i < cOrder.length; i++){
            if(i == Integer.parseInt(command[1]) - 1 ){
                System.out.print(String.valueOf(cOrder[i]).toLowerCase());
                continue;
            }
            System.out.print(cOrder[i]);
        }
    }
}
