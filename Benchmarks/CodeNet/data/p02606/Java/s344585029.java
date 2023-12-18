import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	int y = sc.nextInt();
     	int z = sc.nextInt();
		int ans = 0; 
		for(int i=x;i<=y;i++){
          if( i%z==0 )
            ans++;
		}
		System.out.println(ans);    	
	}
}