import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int K = sc.nextInt();
      
      	if(K <= A){
        	System.out.println(K);
        }else if(K <= A+B){
        	System.out.println(A);
        }else{
        	System.out.println(2*A-K+B);
        }
    }
}