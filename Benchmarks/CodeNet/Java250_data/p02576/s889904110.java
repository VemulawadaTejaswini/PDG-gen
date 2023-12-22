import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
	int ans=0;
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
	int T=sc.nextInt();
        if(N%X==0){
	    ans=T*(N/X);
	}else{
	    ans=T*(N/X+1);
	}
	System.out.println(ans);
    }
}
