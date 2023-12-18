import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		String[] str = ((sc.nextLine()).replace(",", "").replace(".", "")).split(" ");
		int flag = 0;
		for(String s: str){
			int l = s.length();
			if(l >= 3 && l <= 6){
				if(flag == 1){
					System.out.print(" ");
				}
					System.out.print(s);
				flag = 1;
			}
		}
		
		System.out.println();
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}