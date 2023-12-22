import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char[] s = sc.next().toCharArray();
      	int whereC = s.length+1;
      	for(int i = 0; i < s.length; i++){
        	if(s[i] == 'C') {
              whereC = i;
              break;
            }
        }
      	boolean isTrue = false;
      	for(int i = whereC; i < s.length; i++){
        	if(s[i] == 'F'){
              isTrue = true;
              break;
            }
        }
      	if(isTrue) System.out.println("Yes");
      	else System.out.println("No");
    }
}