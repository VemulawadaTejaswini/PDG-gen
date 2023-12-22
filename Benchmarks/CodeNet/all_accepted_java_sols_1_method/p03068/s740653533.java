import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	String k = sc.next();
      	int s = sc.nextInt();
      	String ans = "";
      	char c = k.charAt(s-1);
      	for(int i=0;i<n;i++){
          if( k.charAt(i) == c ){
          	ans += ""+k.charAt(i);
          }else{
            ans += "*";
          }
        }
      System.out.println(ans);
	}
}