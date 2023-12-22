import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int D = scn.nextInt();
        long[] c = new long[26];
        long[][] s = new long[D][26];
        long sumC = 0;
        int maxNum = 0;

        for(int i=0;i<26;i++){
            c[i]=scn.nextLong();
            sumC += c[i];
        }
        for(int i=0;i<D;i++){
            long max = -3000;
            for(int j=0;j<26;j++){
                s[i][j]=scn.nextLong();
                long tmp = s[i][j];
                long su = tmp - sumC + c[j];
                if(max < su){
                    max = su;
                    maxNum = j;
                }
            }
            System.out.println(maxNum+1);
        }

        scn.close();

    }


}
