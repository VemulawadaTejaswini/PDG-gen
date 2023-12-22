import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int month = Integer.parseInt(sc.next().substring(5,7));

        if(month <= 4) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }

    }

}
