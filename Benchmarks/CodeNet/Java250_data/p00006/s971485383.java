import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNext()){
		String a = sc.nextLine();
			StringBuffer sb = new StringBuffer(a);
			sb.reverse();
			System.out.println(sb);
			
		}
	}
	
}