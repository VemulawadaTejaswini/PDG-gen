import java.util.*;
 
class Main{
		public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        
        int max = -1000000,min=1000000,get=0;
        long sum = 0;
        int a = sc.nextInt();
        for(;a>0;a--){
            get = sc.nextInt();
            max = Math.max(max, get);
            min = Math.min(min, get);
            sum + = get;
        }
        System.out.println(min + " " + max + " " + sum);
    }
}