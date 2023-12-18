
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = sc.next().toCharArray();

        int popcount = 0;       //xのpopcount 実際使うのはこれの+1か-1
        for(int i=0;i<n;i++){
            if(c[i] == '1'){
                popcount++;
            }
        }

        int[] num = new int[200001];
        for(int i=0;i<200001;i++){
            num[i] = i;
        }
        int[] popcalc = new int[200001];    //200000までのpopcount計算の結果
        for(int i=0;i<18;i++){
            for(int j=(int) Math.pow(2,i); j<200001; j++){
                if(num[j]%2==1){
                    popcalc[j]++;
                }
                num[j] /= 2;
            }
        }
        for(int i=1;i<200001;i++){
            popcalc[i] = i % popcalc[i];
        }

        //System.out.println(popcalc[26] + ", " + popcalc[27] + ", " + popcalc[28] + ", " + popcalc[29] + ", " + popcalc[30]);

        int[] popplus = new int[n];
        int[] popminus = new int[n];
        int flag = -1;
        for(int i=0;i<n;i++){
            if(flag != -1){
                popplus[n-1-i] = popplus[n-1-i + flag];
            }else {
                popplus[n - 1 - i] = (int) (Math.pow(2, i) % (popcount + 1));
                if(i != 0 && popplus[n-1-i] == popplus[n-1]){
                    flag = i;
                }
            }
        }
        flag = -1;
        if(popcount <= 1){
            Arrays.fill(popminus, 0);
        }else {
            for (int i = 0; i < n; i++) {
                if (flag != -1) {
                    popminus[n - 1 - i] = popminus[n - 1 - i + flag];
                } else {
                    popminus[n - 1 - i] = (int) (Math.pow(2, i) % (popcount - 1));
                    if (i != 0 && popminus[n - 1 - i] == popminus[n - 1]) {
                        flag = i;
                    }
                }
            }
        }
        int popxplus = 0;
        int popxminus = 0;
        for(int i=0;i<n;i++){
            if(c[n-1-i] == '1') {
                popxplus += popplus[n-1-i];
                popxplus %= popcount+1;
                popxminus += popminus[n-1-i];
                if(popcount > 1) {
                    popxminus %= popcount - 1;
                }
            }
        }

        for(int i=0;i<n;i++){
            int count = 1;
            if(c[i] == '0'){
                int search = popxplus + popplus[i];
                search %= popcount+1;
                while(search != 0){
                    count++;
                    search = popcalc[search];
                }
            }else{
                if(popcount > 1){
                    int search = popxminus - popminus[i] + popcount-1;
                    search %= popcount-1;
                    while(search != 0){
                        count++;
                        search = popcalc[search];
                    }
                }else{
                    count = 0;
                }
            }
            System.out.println(count);
        }
    }
}
