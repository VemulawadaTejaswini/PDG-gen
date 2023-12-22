import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    	int ans = 0;
	int b = K-A;
    int c = K-A-B;
	if(A==0 && C==0){
		System.out.println("0");
    }else if(K>=A && c<1){
		System.out.println(A);
	}else if(K>=A && c>=1){
		System.out.println(A+(c*-1));
	}else if(K<A){
        System.out.println(K);
      }
}
}