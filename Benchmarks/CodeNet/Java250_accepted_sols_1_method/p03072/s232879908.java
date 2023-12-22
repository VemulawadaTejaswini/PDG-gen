import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        int ans = 1;
        for(int i = 0; i < n; i++){
        	num[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++){
            int count = 0;
        	for(int j = 0; j < i; j++){
            	if(num[i] >= num[j]){
                	count++;
                }else{
                	break;
                }
            }
            if(count == i){
            	ans++;
            }
        }
        System.out.println(ans);
	}
}