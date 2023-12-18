import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        long ans = 1;
        for(int i=0;i<a;i++){long b = sc.nextLong();                             
                            ans*=b;}
       
		
        long c = 1000000*1000000*1000000;
        if(ans<0 || ans>c){ans=-1;}
		System.out.println(ans);
	}
}
