import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String W=sc.next(),T;
		int num=0;
		while(true){
			T=sc.next();
			if(T.equals("END_OF_TEXT")==false){
				if(T.toLowerCase().equals(W)==true){
					num++;
				}
			}
			else{
				break;
			}
		}
		System.out.println(num);
	}
}
