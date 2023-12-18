import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= Integer.parseInt(sc.next());
		String s = sc.next();
		int k = Integer.parseInt(sc.next());
      	for(int i = 0; i < n; i++){
      		if(s.charAt(i) != s.charAt(k-1)){
      			System.out.print("*");
      		}else {
      			System.out.print(s.charAt(i));
      		}
			}
	}
	
}