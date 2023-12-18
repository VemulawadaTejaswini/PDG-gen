import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
      	long v = sc.nextLong();
      	long b = sc.nextLong();
      	long w = sc.nextLong();
      	long t = sc.nextLong();
      
      	long ans1 = a, ans2 = b;
      
      	for(int i = 0 ; i < t ; i++){
        	ans1 += v;
          	ans2 += w;
          	if(ans2 <= ans1){
      			System.out.println("YES");
              	System.exit(0);
        	}
        }
      
	 	if(ans2 <= ans1){
      		System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
     } 
}