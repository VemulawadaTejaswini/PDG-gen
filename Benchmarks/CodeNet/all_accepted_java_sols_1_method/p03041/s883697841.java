import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        String S=sc.next();
        String s[] = new String[N];
        for(int i=0; i<N;i++){
            s[i]=String.valueOf(S.charAt(i));
        }
        s[K-1]=s[K-1].toLowerCase();
        for(int j=0;j<N;j++){
            System.out.print(s[j]);
        }
    }
}