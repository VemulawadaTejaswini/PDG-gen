import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
        }
        Arrays.sort(in);
        int ans = 0;
        for(int i=0;i<a-2;i++){for(int j=i+1;i<a-1;i++){
          for(int k=j+1;j<a;j++){
          if(in[i]<in[j] && in[j]<in[k] && in[k]<in[i]+in[j]){ans++;}  
                                }                                                 
                                                       }       
                              }
		System.out.println(ans);
	}
}
