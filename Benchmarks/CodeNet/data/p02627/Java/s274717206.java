import java.util.*;
public class main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		int a = s.charAt(0)-0;
		if(a>=97){
			if(a==97){
				System.out.println((char)(a));
			}else{
				System.out.println((char)(a-1));
			}
		}else{
			if(a==64){
				System.out.println((char)(a));
			}else{
				System.out.println((char)(a-1));
			}
		}
	}
}
