import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int K = sc.nextInt();

	int X = sc.nextInt();

	for(int i = 0; i<2*K-1; i++){

	if((X-K+i+1)<=1000000 && (X-K+i+1)>=-1000000){

	System.out.println(X-K+i+1);	

   }
  }
 }
}