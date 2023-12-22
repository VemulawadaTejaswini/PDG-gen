import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[]args){
	int ans=0;
        Scanner sc = new Scanner(System.in);
        String N=sc.next();
	int sum=0;
	for(int i=0; i<N.length(); i++){
	    sum+=Integer.parseInt(N.substring(i,i+1));
	}
	//N.charAt(i)
        if(sum%9==0){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
