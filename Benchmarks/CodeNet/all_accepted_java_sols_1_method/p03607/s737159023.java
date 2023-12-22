import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int x[] = new int[n]; 
        int ans = 0;
        for(int i = 0; i < n; i++){
        	x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        for(int i = 0; i < n; i++){
            int count = 1;
        	for(int j = i + 1; j < n; j++){
            	if(x[i] == x[j]){
                	count++;
                    i++;
                }else{
                    break;
                }
            }
            if(count % 2 == 1){
            	ans++;
            }
        }
        System.out.println(ans);
    }
}