import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i=0;i<n;i++)h[i] = Integer.parseInt(sc.next());
        sc.close();
        int idx1,idx2;
        int min;
        int res = 0;
        while(true){
            idx1 = -1;
            min = 1000000;
            for(int i=0;i<n;i++){
                if(h[i]>0){
                    idx1 = i;
                    min = h[i];
                    break;
                }
            }
            if(idx1==-1)break;
            idx2 = n;
            for(int i=idx1+1;i<n;i++){
                if(h[i]==0){
                    idx2 = i;
                    break;
                }else{
                    min = Math.min(h[i],min);
                }
            }
            for(int i=idx1;i<idx2;i++){
                h[i]-=min;
            }
            res+=min;
        }
        System.out.println(res);
    }
}