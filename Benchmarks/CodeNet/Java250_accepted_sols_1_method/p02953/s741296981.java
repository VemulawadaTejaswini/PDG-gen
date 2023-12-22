import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
	int[] H = new int[N];
  	int cnt=1;
  
	for(int j=0;j<N;j++){
      H[j] = sc.nextInt();
    }
  
  	for(int i=N-1;i>=1;i--){
      if(H[i-1]-1==H[i]){
        H[i-1]--;
        cnt++;
      }else if(H[i-1]<=H[i]){
        cnt++;
      }else{
        break;
      }
    }
  	
  
	//System.out.println("cnt="+cnt);
	if(cnt == N){
		System.out.println("Yes");
    }else{
      	System.out.println("No");
    }
}
}