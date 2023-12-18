import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 0;
		boolean judge = true;
		for(int a=0;a<n;a++){
			String s = sc.next();
			if(s.charAt(0)=='A'){
				counter++;
			}
			else{
				counter--;
			}
			if(counter<0){
				judge = false;
			}
		}
		if(counter==0 && judge){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}