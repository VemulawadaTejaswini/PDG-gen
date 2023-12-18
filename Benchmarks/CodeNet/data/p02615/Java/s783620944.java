import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        long ans = 0;
        int max = a-1;
        int count = 1;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
		Arrays.sort(in);
        for(int i=0;i<a-1;i++){ans+=in[max];count++;
                              if(count==2){max--;count=0;}
                              }      
		System.out.println(ans);
	}
}