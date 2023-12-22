import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String today = scan.nextLine();

        String tomorrow = "";
        switch (today){
            case "Sunny":
                tomorrow = "Cloudy";
                break;
            case "Cloudy":
                tomorrow = "Rainy";
                break;
            case "Rainy":
                tomorrow = "Sunny";
                break;
        }

        System.out.println(tomorrow);
    }
}
