import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String S = "";
        int N=s.nextInt();
        int[] m=new int[111];
        for(int i=0;i<N;i++)m[i]=s.nextInt();
        S=S+m[N-1];
        for(int i=N-2;i>=0;i--)S=S+" "+m[i];
        System.out.println(S);
    }
}
//by TTTMongolia 11/05/2012