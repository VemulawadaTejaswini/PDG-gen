import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] abcd = new int[4];
        for(int i = 0; i < 4; i++){
            abcd[i] = Character.getNumericValue(s[i]);
        }
        for(int i = 0; i < 2; i++){
            String opi = (i == 0) ? "+" : "-";
            int tmp = (i == 0) ? abcd[0] + abcd[1] : abcd[0] - abcd[1];
            
            for(int j = 0; j < 2; j++){
                
                String opj = (j == 0) ? "+" : "-";
                tmp += (j == 0) ? abcd[2] : -abcd[2];
                
                for(int k = 0; k < 2; k++){
                    String opk = (k == 0) ? "+" : "-";
                    tmp += (k == 0) ? abcd[3] : -abcd[3];
                    
                    if(tmp == 7){
                        System.out.println(abcd[0] + opi + abcd[1] + opj + abcd[2] + opk + abcd[3] + "=7");
                        return;
                    }
                    tmp -= (k == 0) ? abcd[3] : -abcd[3];
                }
                
                tmp -= (j == 0) ? abcd[2] : -abcd[2];
            }
        }
    }
}
