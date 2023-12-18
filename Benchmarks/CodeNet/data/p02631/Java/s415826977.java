import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] in = new long [n];
        long [] ans = new long [n];
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
                             in[i] = sc.nextLong();
                             sum=sum^in[i];
        }
        for(int i=0;i<n;i++){ans[i]=sum^in[i];
                             sb.append(String.valueOf(ans[i]));
                             sb.append(" ");
                            }
       System.out.println(sb.toString());
		
	}
}