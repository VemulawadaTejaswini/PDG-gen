import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] alp = new long[28];
        int[] id = {'M'-'A', 'A'-'A', 'R'-'A','C'-'A', 'H'-'A'};
        long ans = 0;
        for(int i = 0;i < N;i++)  alp[sc.next().charAt(0)-'A']++;
        for(int i = 0;i <= 2;i++){
            for(int j = i+1;j <= 3;j++){
                for(int k = j+1;k <= 4;k++){
                    ans += alp[id[i]]*alp[id[j]]*alp[id[k]];
                }
            }
        }
        System.out.println(ans);  
    }
}