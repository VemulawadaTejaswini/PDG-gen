import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int wcount=0;
		int count=0;
		for(char c: N.toCharArray()){
		    if(c=='W'){
		        wcount++;
		    }
		}
		for(int i=N.length()-wcount;i<N.length();i++){
		    if(N.charAt(i)=='R'){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
