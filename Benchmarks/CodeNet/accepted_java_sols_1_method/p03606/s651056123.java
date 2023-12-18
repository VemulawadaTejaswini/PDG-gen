import java.util.*;
 
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]a = new int[N*2];
   
    int ans = 0;
    for(int i=0; i<N*2; i++){
    a[i] = sc.nextInt();
    if(i%2!=0){
        ans += a[i]-a[i-1]+1;
    }
}
    	System.out.println(ans);
    }
}