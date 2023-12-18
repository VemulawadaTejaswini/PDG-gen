import java.util.*;

public class Main{
//public class abc166_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		int[] p = new int[101];
		for(int i=0; i<n; i++){
			p[scan.nextInt()] = 1;
		}
		
		int px = x;
		int mx = x;
		if(p[x] == 0)System.out.println(x);
		while(p[x] != 0){
			px += 1;
			mx -= 1;
			if(p[px] == 0){
				System.out.println(px);
				break;
			} 
			if(mx > 0){
				if(p[mx] == 0){
					System.out.println(mx);
					break;
				} 
			}else{
				//System.out.println(mx);
				//break;
			}
		}

	}

}