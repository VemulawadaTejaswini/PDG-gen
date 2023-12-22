import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        
        int res=0;
        int count=0;
        for(int i=0; i<3; i++){
            if(S[i]=='R'){
                res++;
                count = res;
            }else{
                res = 0;
            }
        }
        
        System.out.println(count);
                
            
        
        
        
        
        
        }
    }