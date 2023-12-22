import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		String str=sc.next();
		
		int len=str.length();
		
		if(k>=len){
			System.out.println(str);
		}
		else{
			for(int i=0;i<k;i++){
				char ch=str.charAt(i);
				System.out.print(ch);
			}
			System.out.println("...");
		}
	}
}
