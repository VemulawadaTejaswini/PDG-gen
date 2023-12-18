import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// 身長の入力
      	int[] tall = new int[n];
		for(int i=0;i<n;i++){
          tall[i]= sc.nextInt();
        }
    
    /*--------------------------------*/
      long ans =0;
      for(int l = 0; l<n-1;l++){
    	if(tall[l] > tall[l+1]){
      		ans += tall[l] - tall[l+1];
      		tall[l+1] = tall[l];
     	}
      }
      System.out.println(ans);
	}
}

