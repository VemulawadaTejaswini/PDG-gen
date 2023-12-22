import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		int B=sc.nextInt();
		int ans;
		
		if (A==B){
		    ans=A+B;
		}else{
		    if (A<B){A=B;}
		    ans=A*2-1;
		}

        System.out.println(ans);
    }
}
