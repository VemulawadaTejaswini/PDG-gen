import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int n1 = n / 2;
		String s1 = s.substring( 0 , n1);
		String s2 = s.substring(n1 + 1);
		int i=0;
		int j = n-1;
		boolean c1 = true;
		while(i < j){
		    if(s.charAt(i) != s.charAt(j)){
		        c1 = false;
		        break;
		    }
		    i++;
		    j--;
		}
		i =0;
		j = s1.length()-1;
		boolean c2 = true;
        while(i < j){
		    if(s1.charAt(i) != s1.charAt(j)){
		        c2 = false;
		        break;
		    }
		    i++;
		    j--;
		}
		i = 0;
		j = s2.length()-1 ;
		boolean c3 = true;
        while(i < j){
		    if(s2.charAt(i) != s2.charAt(j)){
		        c3 = false;
		        break;
		    }
		    i++;
		    j--;
		}
		if(c1&&c2&&c3){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
