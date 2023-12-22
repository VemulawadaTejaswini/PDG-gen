import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int[] x=new int[s.length()];
		int sum = 0;
		int a = 0,b = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A'){
				a = i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)=='Z'){
				b = i;
				break;
			}
		}
		sum = Math.abs(b-a+1);
		System.out.print(sum);
	}
}