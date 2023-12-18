import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int animalCnt = sc.nextInt();
        int pon = sc.nextInt();
        
        boolean flg = false;
        for (int turtle = 0; turtle <= animalCnt; turtle++) {
            int n = turtle * 4 + (animalCnt - turtle) * 2;

            if (pon == n) {
                flg = true;
                break;
            }
        }

        System.out.println(flg ? "Yes" : "No");
    }
}