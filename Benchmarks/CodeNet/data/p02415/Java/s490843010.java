import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(char c: str.toCharArray()){
			if((int)c <= 122 && 97 <= (int)c){
				c -= 32;
			}else if((int)c <=90 && 65 <= (int)c){
				c += 32;
			}
			System.out.print(c);
		}
		call();
	}

	public static void call(){
		System.out.println();
	}
}


