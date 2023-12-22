import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char[] s = sc.next().toCharArray();
      	char[] goal = "CODEFESTIVAL2016".toCharArray();
      	int count = 0;
      	for(int i = 0; i < s.length; i++){
        	if(s[i] != goal[i]) count++;
        }
      	System.out.println(count);
    }
}