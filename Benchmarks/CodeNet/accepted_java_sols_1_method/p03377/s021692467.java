import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int catCnt = sc.nextInt();
        int animalCnt = sc.nextInt();
        int requiredNumber = sc.nextInt();
        int remaining = requiredNumber - catCnt;
        if(animalCnt >= remaining && remaining >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}