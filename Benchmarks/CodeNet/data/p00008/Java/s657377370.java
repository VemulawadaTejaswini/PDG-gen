import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int number;
	public static void main(String[] args){
		while(read()){
			slove();
		}
	}
	static boolean read(){
		if(!sc.hasNextInt()){
			return false;
		}
		
		number = sc.nextInt();
		return true;
	}
	static void slove(){
		int a, b, c, d, count;
		count = 0;
		for(a = 0; a < 10; a++){
			for(b = 0; b < 10; b++){
				for(c = 0; c < 10; c++){
					for(d = 0; d < 10; d++){
						if(a+b+c+d == number){
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}