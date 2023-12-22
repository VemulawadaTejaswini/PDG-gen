import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c[] = new int[a];
        int ans,count = 0;
      	for(int i = 0;i < a;i++){
          c[i] = sc.nextInt();
          b -= c[i];
          count += 1;
        }
        Arrays.sort(c);
        while(b >= c[0]){
          b -= c[0];
          count += 1;
          
        }
        
          System.out.println(count);

 
      	
 
    }
}