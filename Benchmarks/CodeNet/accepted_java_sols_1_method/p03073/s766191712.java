import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int target = 0;
        int changedCntFrm0 = 0;
        int changedCntFrm1 = 0;

        int tile[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            tile[i] = s.charAt(i);
        }


        for (int i = 0; i < s.length(); i++) {

            if (i % 2 == 0) {
                target = 48;
            } else {
                target = 49;
            }
            if (tile[i] != target) {
                changedCntFrm0++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                target = 49;
            } else {
                target = 48;
            }
            if (tile[i] != target) {
                changedCntFrm1++;
            }
        }
        if (changedCntFrm0 >= changedCntFrm1){
            System.out.println(changedCntFrm1);
        }else{
            System.out.println(changedCntFrm0);
        }
        sc.close();
    }
}
