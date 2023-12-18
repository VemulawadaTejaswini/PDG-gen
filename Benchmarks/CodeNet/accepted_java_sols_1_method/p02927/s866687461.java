import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int M = sc.nextInt();

	int D = sc.nextInt();

	int ans = 0;

	for(int j=1; j<=M; j++){

	for(int i=1; i<=D; i++){

	int k = i/10;

	if(k>=2 && k*(i-10*k)==j && (i-10*k)>=2){

	ans++;

    }
 
   }
  }

	System.out.println(ans);

 }
}