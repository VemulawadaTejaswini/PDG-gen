import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
      	int cnt = 0;
      	for(int i=0; i<S.length(); i++){
          	int num = S.charAt(i) - '0' ;
        	if (i%2 == num) cnt++;
        }
      	System.out.println(Math.min(cnt,S.length()-cnt));
    }
}