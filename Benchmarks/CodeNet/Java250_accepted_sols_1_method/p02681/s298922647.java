import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char[] S = sc.next().toCharArray();
      	char[] T = sc.next().toCharArray();
      	boolean isTrue = true;
      	for(int i = 0; i < T.length-1; i++){
        	if(S[i] != T[i]){
              isTrue = false;
              break;
            }
        }
      	if(isTrue) System.out.println("Yes");
      	else System.out.println("No");
    }
}