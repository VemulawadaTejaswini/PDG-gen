import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a="0";
		while(true){
			String num=sc.next();
			if(num.equals(a)){
				break;
			}else{
				int sum=0;
				for(int i=0;i<num.length();i++){
					int k=num.charAt(i)-a.charAt(0);
					sum+=k;
				}
				System.out.println(sum);
			}
		}
	}
}