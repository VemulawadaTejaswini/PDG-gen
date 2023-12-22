import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
    int N= sc.nextInt();
    long D=(long)Math.pow(sc.nextInt(),2);
    long d[]= new long[N];
    int ans =0;
    for(int i=0; i<N; i++){
        d[i]= (long)Math.pow(sc.nextInt(),2)+ (long)Math.pow(sc.nextInt(),2);
        if(D>=d[i]){
            ans++;
        }
    }
System.out.println(ans);
    }
}
