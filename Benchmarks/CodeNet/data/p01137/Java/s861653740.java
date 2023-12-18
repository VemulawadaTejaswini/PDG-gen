import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int e = sc.nextInt();
			if(e==0) break;
			int min = Integer.MAX_VALUE;
			for(int z=0;z*z*z<=e;z++){
				for(int y=0;y*y+z*z*z<=e;y++){
					int x = e-(y*y+z*z*z);
					min = Math.min(min,x+y+z);
				}
			}
			System.out.println(min);
		}
	}	
}