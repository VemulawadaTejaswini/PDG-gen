import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		char ch[]=a.toCharArray();
		int c=0;
		for(int i=0;i<3;i++){
			if(ch[i]==ch[i+1]){
				c++;
				break;
			}
		}
			if(c>0)
				System.out.println("Bad");
			else System.out.println("Good");
	}
}