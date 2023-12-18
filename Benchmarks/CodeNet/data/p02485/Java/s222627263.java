import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String a="0";
		while(true){
			int S=0;
			String x=sc.next();
			int n=x.charAt(0)-a.charAt(0);
			if(n==0){
				break;
			}else{
				for(int i=0;i<x.length();i++){
					S+=x.charAt(i)-a.charAt(0);
				}
				System.out.println(S);
			}
		}
	}
}