import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] input = new int[n];
        int [] output = new int[n];
        int k = 0;
        for(int i=0;i<n;i++){
            input[i] = sc.nextInt();
            if(input[i] > k) k = input[i];
        }
        int [] C = new int[k+1];
        Arrays.fill(C,0);
        for(int i=0;i<n;i++) C[input[i]]++;
        for(int i=1;i<=k;i++) C[i] += C[i-1];
        for(int i=n-1;i>=0;i--){
            output[C[input[i]]-1] = input[i];
            C[input[i]]--;
        }
        StringBuilder ans = new StringBuilder();
        ans.append(output[0]);
        for(int i=1;i<n;i++) ans.append(" "+output[i]);
        System.out.println(ans);
    }
}
