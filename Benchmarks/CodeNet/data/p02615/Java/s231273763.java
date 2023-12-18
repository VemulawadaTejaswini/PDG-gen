import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        long ans = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                             ans+=in[i];
                            }     		
        if(a>1){System.out.println(ans-in[0]-in[1]+in[a-2]);}
        else{System.out.println(0);}
	}
}