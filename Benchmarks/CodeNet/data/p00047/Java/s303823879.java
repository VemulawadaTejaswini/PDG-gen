import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String BallPlace = "A";
        while (sc.hasNext()){
            String Ball[] = sc.nextLine().split(",");
            if (Ball[0].equals(BallPlace)) {
                BallPlace = Ball[1];
            }else if (Ball[1].equals(BallPlace)){
                BallPlace = Ball[0];

            }

        }
        System.out.println(BallPlace);
    }
}