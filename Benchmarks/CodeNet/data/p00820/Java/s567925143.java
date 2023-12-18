import java.io.*;
import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0 )break;
			
			HashSet<Integer> map = new HashSet<Integer>();
			for(int i = 1; i * i <= (1 << 15); i++){
				map.add(i * i);
			}
			
			int count = 0;
			for(int i = 0; i * i <= n; i++){
				for(int j = i; j * j <= n; j++){
					for(int k = j; k * k <= n; k++){
						int temp = (i * i + j * j + k*k);
						int l = n - temp;
						if(l + temp > n){
							break;
						}
						
						if(l >=k * k && map.contains(l)){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}