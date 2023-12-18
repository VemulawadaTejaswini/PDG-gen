import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String f = sc.nextLine();
		if(f.equals("RRR")){
			System.out.println(3);
		}else if(f.equals("SSS")){
			System.out.println(0);
		}else if(f.equals("SRR")){
			System.out.println(2);
		}else if(f.equals("RRS")){
			System.out.println(2);
		}else{
			System.out.println(1);
		} 
		
		
	}
}