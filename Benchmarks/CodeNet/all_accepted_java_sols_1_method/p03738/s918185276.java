import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		String b = sc.next();        
        int n = a.length();
        int m = b.length();
        String an[] = a.split("");
        String bm[] = b.split("");
        int i,y,z;
        if(n > m){
          System.out.println("GREATER");
          System.exit(0);
        }else if(m > n){
          System.out.println("LESS");
          System.exit(0);          
        }
        for(i = 0; i < n; i++){
			if(Integer.parseInt(an[i]) > Integer.parseInt(bm[i])){
         	 	System.out.println("GREATER");
         	 	System.exit(0);              
            }else if(Integer.parseInt(an[i]) < Integer.parseInt(bm[i])){
             	System.out.println("LESS");
         		System.exit(0);     
            }
        }
        
      	System.out.println("EQUAL");
 
    }
}