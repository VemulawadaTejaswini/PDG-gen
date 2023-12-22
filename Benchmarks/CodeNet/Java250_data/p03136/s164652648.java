import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int[] l = new int[n];
        String ans = "No";
        
        for(int i=0; i<n; i++){
            l[i] = sc.nextInt();
        }
        
        Arrays.sort(l);
        int sum=0;
        
        for(int i=0; i<n-1; i++){
            sum+=l[i];
        }
        
        if(sum>l[n-1]){
            ans="Yes";
        }
        
        System.out.println(ans);
        
	}
}