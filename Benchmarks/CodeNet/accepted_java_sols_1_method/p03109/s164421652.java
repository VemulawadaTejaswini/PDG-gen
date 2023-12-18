import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int date = Integer.parseInt(String.join("", S.split("/")));
        System.out.println(date <= 20190430 ? "Heisei" : "TBD");
    }
}
