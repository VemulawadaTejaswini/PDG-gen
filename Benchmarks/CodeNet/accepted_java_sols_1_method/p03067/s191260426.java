import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		if(a > b){
			int temp = a;
			a = b;
			b = temp;
		}
		boolean flg = false;
		for(int i=a; i<b; i++){
			if(i == c){
				flg = true;
				break;
			}
		}
		System.out.println(flg ? "Yes" : "No");
	}
}
