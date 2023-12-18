import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char[] ch=new char[3];
		for(int i=0;i<3;i++){
			String str=sc.next();
			ch[i]=str.charAt(i);
		}
		for(char c:ch)System.out.print(c);
		sc.close();
		return;
	}
}