import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ticket, result;
        while(sc.hasNext()){
            ticket = sc.nextLine();

            switch(ticket) {
                case "1 1 0":
                case "0 0 1":
                    result = "Open";
                    break;
                default:
                    result = "Close";
                    break;
            }

            System.out.println(result);
        }
    }
}