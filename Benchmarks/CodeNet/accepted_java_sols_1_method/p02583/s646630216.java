import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int[] L = new int[N];
        for(int i=0;i<N;i++) L[i] = scn.nextInt();

        int ans = 0;

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=j+1;k<N;k++) {
                    if(L[i]+L[j]>L[k]&&L[i]+L[k]>L[j]&&L[j]+L[k]>L[i])
                    if(L[i]!=L[j] && L[i]!=L[k] && L[j]!=L[k]){
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}