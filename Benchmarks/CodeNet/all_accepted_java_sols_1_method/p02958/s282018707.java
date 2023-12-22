import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]P = new int[N];
    int[]sin = new int[N];
    
    int cou = 0;
    for(int i=0; i<N; i++) {		
    	P[i] = sc.nextInt();
    	sin[i] = P[i]; 
    }
    Arrays.sort(sin);
    
    for(int i=0; i<N; i++) {
    if(P[i]!=sin[i]) {
    		cou++;
    	}
    }
      if(cou<=2){
        System.out.println("YES");
      }else{
        System.out.println("NO");        
      }
      }
}