import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        String s = stdIn.next();

        char[] cs = s.toCharArray();
        int[] dpR = new int[n];
        int[] dpG = new int[n];
        int[] dpB = new int[n];
        switch(cs[n-1]){
            case 'R': dpR[n-1] = 1; break;
            case 'G': dpG[n-1] = 1; break;
            case 'B': dpB[n-1] = 1; break;
        }
        for(int i=n-2; i>=0; i--){
            switch(cs[i]){
                case 'R': dpR[i] = dpR[i+1] + 1; dpG[i] = dpG[i+1]; dpB[i] = dpB[i+1]; break;
                case 'G': dpR[i] = dpR[i+1]; dpG[i] = dpG[i+1] + 1; dpB[i] = dpB[i+1]; break;
                case 'B': dpR[i] = dpR[i+1]; dpG[i] = dpG[i+1]; dpB[i] = dpB[i+1] + 1; break;
            }
        }

        boolean rFlag, gFlag, bFlag;
        long counter = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j < n-1; j++){
                if(cs[i] == cs[j]){
                    continue;
                }
                rFlag = false;
                gFlag = false;
                bFlag = false;
                switch(cs[i]){
                    case 'R': rFlag = true; break;
                    case 'G': gFlag = true; break;
                    case 'B': bFlag = true; break;
                }
                switch(cs[j]){
                    case 'R': rFlag = true; break;
                    case 'G': gFlag = true; break;
                    case 'B': bFlag = true; break;
                }

                if(j + (j-i) >= n){
                    if(!rFlag){
                        counter += ((n -j - 1) - dpG[j+1] - dpB[j+1]);
                    }else if(!gFlag){
                        counter += ((n -j - 1) - dpR[j+1] - dpB[j+1]);
                    }else{
                        counter += ((n -j - 1) - dpR[j+1] - dpG[j+1]);
                    }
                }else{
                    if(cs[i] != cs[j + (j-i)] && cs[j] != cs[j + (j-i)]){
                        if(!rFlag){
                            counter += ((n -j - 1) - dpG[j+1] - dpB[j+1] - 1);
                        }else if(!gFlag){
                            counter += ((n -j - 1) - dpR[j+1] - dpB[j+1] - 1);
                        }else{
                            counter += ((n -j - 1) - dpR[j+1] - dpG[j+1] - 1);
                        }
                    }else{
                        if(!rFlag){
                            counter += ((n -j - 1) - dpG[j+1] - dpB[j+1]);
                        }else if(!gFlag){
                            counter += ((n -j - 1) - dpR[j+1] - dpB[j+1]);
                        }else{
                            counter += ((n -j - 1) - dpR[j+1] - dpG[j+1]);
                        }
                    }
                }

            }
        }

        System.out.println(counter);
    }
}