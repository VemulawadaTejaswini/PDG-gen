import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int res=0;
        if(L>=0){
            res = (N+2*L)*(N-1)/2;
        }else if(L+N-1>=0){
            res = N*(2*L+N-1)/2;
        }else{
            res = N*(2*L+N-1)/2 - (L+N-1);
        }
        
        System.out.println(res);
        
        }
    }