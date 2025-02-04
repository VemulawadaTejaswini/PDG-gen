import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int D = scn.nextInt();
        long[] c = new long[26];
        long[][] s = new long[D][26];
        int maxNum = 0;
        int[] ld = new int[26];
        Arrays.fill(ld,0);

        for(int i=0;i<26;i++){
            c[i]=scn.nextLong();
        }

        for(int i=0;i<D;i++){
            long max = -180000000;
            long sumC = 0;

            for(int j=0;j<26;j++){
                sumC += (i-ld[j])*c[j];
            }
            for(int j=0;j<26;j++){
                s[i][j]=scn.nextLong();
                long tmp = s[i][j];
                long su = tmp - sumC+c[j]*(i-ld[j]);
                if(max < su){
                    max = su;
                    maxNum = j;
                }
            }
            //score += max;
            System.out.println(maxNum+1);
            ld[maxNum]=i;
        }

        //System.out.println(score);

        scn.close();

    }


}
