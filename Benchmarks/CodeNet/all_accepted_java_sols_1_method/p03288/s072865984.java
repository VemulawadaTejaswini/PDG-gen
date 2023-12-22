import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        String rating;

        if(R < 1200){
            rating = "ABC";
        } else if (R < 2800) {
            rating = "ARC";
        } else {
            rating = "AGC";
        }

        System.out.println(rating);
    }
}