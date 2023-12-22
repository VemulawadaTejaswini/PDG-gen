import java.util.*;

public class Main {
	public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		
        int k =D*2+1;
        
        if(N%k==0){
        System.out.print(N/k);
        }else{
        System.out.print(N/k+1);    
        }
}
}
