import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        int res = 0;
        
        if(l%d==0){
            res = 1;
        }
        res = res + r/d - l/d; 
        
        System.out.println(res);
                
            
        
        
        
        
        
        }
    }