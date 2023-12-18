import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			String buffer = sc.nextLine();
			
			Scanner in = new Scanner(buffer);
			
			
			int data[] = new int[24];
			
			for(int i = 0; i < 23 && in.hasNextInt() ; i++){
				data[i] = in.nextInt();
			}
			
			if(data[0] == 0){
				break;
			}
			
			int vkv = 0;
			boolean one = false;
			for(int i = 0; data[i] != 0; i++){
				if(data[i] == 1){
					one = true;
				}
				vkv += Math.min(data[i], 10);
			}
			
			if(vkv+10 <= 21){
				if(one){
					vkv += 10;
				}
			}
			if(vkv > 21){
				vkv = 0;
			}
			System.out.println(vkv);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}