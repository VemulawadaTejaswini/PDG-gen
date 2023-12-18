import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a=0;
        if((N-1)%(K-1)!=0){
            a = K-1;
        }
        int res = (N-1+a)/(K-1);
        

        
        System.out.println(res);
        }
    }