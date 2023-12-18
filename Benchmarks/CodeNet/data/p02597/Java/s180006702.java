import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String Cz = sc.next();

        int firstR = -1;
        int cntW = 0;
        int cntR = 0;
        char thisChar = ' ';
        for (int i = 0; i < N; i ++){
            thisChar = Cz.charAt(i);
            if (thisChar == 'R'){
                cntR++;
            }
//
//            if (firstR == -1){
//                if (thisChar == 'W') cntW++;
//            } else {
//                if (thisChar == 'R') cntR++;
//            }
//            if ((firstR == -1) && (Cz.charAt(i) == 'R')){
//                firstR = i;
//            }
        }

        int leftR = 0;
        if (cntR == 0){
            System.out.println("0");
            System.exit(0);
        }
        for (int i = 0; i < cntR; i++){
            thisChar = Cz.charAt(i);
//            System.out.println("thisChar "+i+" "+thisChar);
            if (thisChar == 'R'){
                leftR++;
            }
        }
//        System.out.println(cntR);
//        System.out.println(leftR);
        System.out.println(cntR - leftR);


//        if (cntW <= cntR){
//            System.out.println(cntR + 1 - 1);
//        } else {
//            System.out.println(cntR + 1);
//        }

    }
}