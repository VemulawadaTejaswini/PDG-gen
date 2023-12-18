import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String stone = sc.next();
		
		int sta = 0;
		count = 0;
		
		if(stone.charAt(0).equals("R") && stone.charAt(stone.length() -1).equals("W")){
				sta++;
		}
		
		for(int i = 0; i < stone.length(); i++){
			if(stone.charAt(i) == W){
				count++;
			}
		}
		
		if(stone.charAt(i).equals("R") && stone.charAt(stone.length() -1).equals("W")){
				count--;
		}
		
		System.out.println(count);
	}
}