import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int ans=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] S=new int[n];
        for(int i=0;i<n;i++){
            S[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int[] T=new int[q];
        for(int i=0;i<q;i++){
            T[i]=sc.nextInt();
        }
        Arrays.sort(S);
        Arrays.sort(T);
        int[] newS=new int[n+1];
        for(int i=0;i<n+1;i++)
            newS[i]=-1;
        newS[0]=S[0];
        int k=1;
        for(int i=1;i<n;i++){
            if(S[i]!=S[i-1])
                newS[k++]=S[i];
        }
        for(int i=0;i<q;i++){
            for(int j=0;newS[j]!=-1;j++){
                if(newS[j]==T[i]){
                    ans++;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

