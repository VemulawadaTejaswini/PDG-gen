import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] str = new String[n];
        int[] count = new int[n];
        String[] ans = new String[n];
        int max = 0;
        
        for(int i=0; i<n; i++){
            str[i] = sc.next();
            count[i]=0;
        }
        
        Arrays.sort(str);
        
        for(int i=0; i<n-1; i++){
        	for(int j=i+1; j<n; j++){
            	if(str[i].equals(str[j])){
                	count[i]++;
                }else{
                	break;
                }
            }
            max = Math.max(max, count[i]);
            i += count[i];
        }
        
        for(int i=0; i<n; i++){
        	if(max==count[i]){
            	System.out.println(str[i]);
            }
        }
   }
}
