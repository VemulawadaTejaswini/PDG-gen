import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int M = sc.nextInt();
        int[] hcount = new int[H];
        int[] wcount = new int[W];
        Set<String> hw = new HashSet<>();
        int maxH = 0;
        int maxW = 0;
        Set<Integer> candidateH = new HashSet<>();
        Set<Integer> candidateW = new HashSet<>();
        for(int i=0;i<M;i++){
            int h = sc.nextInt()-1;
            int w = sc.nextInt()-1;
            hw.add(h + ":" + w);
            hcount[h]++;
            wcount[w]++;
            maxH = Math.max(maxH,hcount[h]);
            maxW = Math.max(maxW,wcount[w]);
        }

        for(int i=0;i<H;i++){
            if(maxH == hcount[i]){
                candidateH.add(i);
            }
        }

        for(int j=0;j<W;j++){
            if(maxW == wcount[j]){
                candidateW.add(j);
            }
        }


        boolean find = false;
        for(int i : candidateH){
            for(int j : candidateW){
                if(!hw.contains(i + ":" + j)){
                    find = true;

                }
            }
        }

        if(find){
            System.out.println(maxH + maxW);
        } else {
            System.out.println(maxH + maxW -1);
        }


    }

}


