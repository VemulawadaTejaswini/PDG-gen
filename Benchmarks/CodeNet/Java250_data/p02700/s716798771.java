import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int Chp = C;
            int Ahp = A;
            while(Chp > 0){
                Chp -= B;

                if(Ahp <= 0){
                    System.out.println("No");
                    return;
                }
                Ahp -= D;
            }
            System.out.println("Yes");
        }
    }
