import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] lun = new int[16];
        int digit = 0;

        for(;k > 0; k--){
            boolean allnine = true;
            int nines = 0;
            for(int i = 0 ; i <= digit ; i++){
                if(lun[i] != 9){
                    allnine = false;
                    nines = i;
                }
            }
            if(allnine){
                digit++;
                for(int i = 0 ; i < digit ; i++){
                    lun[i] = 0;
                }
                lun[digit] = 1;
            }else {
                int addPos = 0;
                while ((lun[addPos] - 1 == lun[addPos + 1]) && addPos < digit) {
                    addPos++;
                }
                lun[addPos]++;
                for (int i = addPos - 1; i >= 0; i--) {
                    lun[i] = Math.max(lun[i + 1] - 1, 0);
                }

                boolean hasten = false;
                for(int i = digit ; i >= 0 ; i--){
                    if(lun[i] == 10){
                        hasten = true;
                    }
                }
                if(hasten){
                    k++;
                }
            }
        }

        StringBuilder strb = new StringBuilder();
        for(int i = digit ; i >= 0 ; i--){
            strb.append(lun[i]);
        }
        System.out.println(strb.toString());

    }
}
