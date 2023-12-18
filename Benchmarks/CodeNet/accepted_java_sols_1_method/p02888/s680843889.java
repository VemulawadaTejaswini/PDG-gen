import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] l = new int[N];
        for(int i = 0; i < N; i++){
            l[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(l);
        long ans = 0;

        int[] s = new int[l[N-1]+1]; // 
        for(int i = 0; i < N; i++){
            s[l[i]]++;
        }
        for(int i = 1; i < s.length; i++){
            if(s[i] == 0){
                s[i] = s[i-1];
            } else {
                s[i] = s[i-1] + s[i];
            }
        }
        
        for(int i = 0; i < N-1; i++){
            for(int j = i+1; j < N-1; j++){
                if(l[i]+l[j] <= l[N-1])
                    ans += s[l[i]+l[j]-1]-j-1;
                else
                    ans += s[l[N-1]]-j-1;
            }
        }
        System.out.println(ans);
    }
}