import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int ans = 0;
		int [] in = new int [n];
        for(int i=0;i<n;i++){in[i] = sc.nextInt();}
        Arrays.sort(in);
        for(int i=0;i<n-2;i++){
        for(int j=i+1;j<n-1;j++){
        int small = j;
        int big = n;
        int point = (small+big)/2;
        int size = point-small;               
        while(big-small>1){size = Math.max(size/2,1);
                         if(in[i]+in[j]>in[point]){small=point;point+=size;}
                         else{big=point;point-=size;}                
                        }
        ans+=small-j;
        }                              
                              }         
        System.out.println(ans);
	}
}