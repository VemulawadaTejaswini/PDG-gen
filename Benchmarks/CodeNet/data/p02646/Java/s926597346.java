import java.util.*;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int v = sc.nextInt();
      	int b = sc.nextInt();
      	int w = sc.nextInt();
      	int t = sc.nextInt();
      
      	int ans1 = a, ans2 = b;
      
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