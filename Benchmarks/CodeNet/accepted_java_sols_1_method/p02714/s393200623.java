import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N, CR=0,CG=0,CB=0;
        String S;
        int[] R =new int[4000];
        int[] G =new int[4000];
        int[] B =new int[4000];
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S= sc.next();

        for(int i=0; i<S.length(); i++) {
            if (S.charAt(i) == 'R') {
                R[CR] = i;
                CR++;
            }
            if (S.charAt(i) == 'G') {
                G[CG] = i;
                CG++;
            }
            if (S.charAt(i) == 'B') {
                B[CB] = i;
                CB++;
            }
        }
        Long res = (long)CR*CG*CB;
        for(int i=0; i< CR; i++){
            for(int j=0; j<CG; j++){
                if((R[i]+G[j])%2==0 && Arrays.binarySearch(B,0,CB,(R[i]+G[j])/2)>=0)
                    res--;
            }
        }
        for(int i=0; i< CG; i++){
            for(int j=0; j<CB; j++){
                if((G[i]+B[j])%2==0 && Arrays.binarySearch(R,0,CR,(G[i]+B[j])/2)>=0)
                    res--;
            }
        }
        for(int i=0; i< CB; i++){
            for(int j=0; j<CR; j++){
                if((B[i]+R[j])%2==0 && Arrays.binarySearch(G,0,CG,(B[i]+R[j])/2)>=0)
                    res--;
            }
        }
        System.out.println(res<0?0:res);

    }
}
