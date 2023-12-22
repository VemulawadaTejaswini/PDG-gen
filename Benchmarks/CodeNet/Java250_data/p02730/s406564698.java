import java.util.*;
import java.lang.*;
public class Main {
	public static boolean checkPalindrome(char[] arr, int a, int b){
		for(int i=a;i<b-a;i++){
			if(arr[i]!=arr[b-a-i-1]){
				return false;
			}
		}
		return true;

	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		char[] s=sc.nextLine().toCharArray();
		int n=s.length;
		if(checkPalindrome(s,0,n)&&checkPalindrome(s,0,(n-1)/2)&&checkPalindrome(s,(n+3)/2,n)){
			System.out.print("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}