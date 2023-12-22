import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    if(n%2 == 0){
    	int[] d = new int[n];
    	for(int i=0; i<n; i++){
			d[i] = sc.nextInt();
    	}
    

    	Arrays.sort(d);
      
    	int ans = d[n/2]-d[n/2-1];
    	System.out.println(ans);
    }
    else{
      System.out.println(0);
    }
  }
}