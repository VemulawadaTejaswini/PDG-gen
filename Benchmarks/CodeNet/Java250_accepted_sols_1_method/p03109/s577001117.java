import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("/");

        String ans = "";
        if (Integer.parseInt(arr[0]) == 2019 &&  Integer.parseInt(arr[1]) <= 4 || Integer.parseInt(arr[0]) < 2019) ans = "Heisei";
        else ans = "TBD";

        System.out.println(ans);
    }
}