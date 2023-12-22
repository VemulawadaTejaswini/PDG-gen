import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];      
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }		
        long max = in[0];
		long ans = 0;
        for(int i=0;i<a;i++){if(max>in[i]){ans+=max-in[i];}
                             max=Math.max(in[i],max);
                            }       
		System.out.println(ans);
	}
}