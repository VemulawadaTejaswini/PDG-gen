import java.util.Scanner;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C= sc.nextInt();
      	int K = sc.nextInt();
      
      	if(A < B){
        	for(int i=0; i<K; i++){
            B = B*2;	
            }
        if(B < C){
        	for(int h=0; h < K; h++){
            C = C*2;
            }
        }
          if(A < B && B < C){
          System.out.println("yes");
          }else{System.out.println("No");}
        }
      	
    }
}