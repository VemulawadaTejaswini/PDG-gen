import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ans=0;
        int[] S=new int[n];
        for(int i=0;i<n;i++)S[i]=sc.nextInt();
        int q=sc.nextInt();
        int[] T=new int[q];
        for(int i=0;i<q;i++)T[i]=sc.nextInt();
        Arrays.sort(T);
        for(int i=0;i<q;i++){
            for(int j=i;j<n;j++){
                if(T[i]==S[j]){
                    ans++;
                    break;
                }else if(T[i]<S[j]){
                    break;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
