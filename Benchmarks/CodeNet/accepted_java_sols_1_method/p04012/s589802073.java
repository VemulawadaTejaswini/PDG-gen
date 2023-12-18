import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    char[] a = new char[n];
    a = s.toCharArray();
    int count = 0;
    String ans_str = "Yes";

    for(char c = 'a';c <= 'z';c++){
    	count = 0;
    	for(int i = 0 ; i < n ; i++){
    		if(a[i] == c){
    			count++;
    		}
    	}
    	if(count % 2 != 0){
    		ans_str = "No";
    		break;
    	}
    }    
    System.out.println(ans_str);
  }
}
