import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int N = sc.nextInt();
        int totalA = 0;

        for(int i=0;i<N;i++){
            totalA += sc.nextInt();
        }
        if(totalA >= H) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}




