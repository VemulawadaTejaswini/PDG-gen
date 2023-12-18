import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Register Phase
public class Main{
	Scanner sc=new Scanner(System.in);

	String s;

	void run(){
		s=sc.nextLine();
		solve();
	}

	void solve(){
		boolean f1=false, f2=false, f3=false;
		for(char c : s.toCharArray()){
			f1|=Character.isDigit(c);
			f2|=Character.isLowerCase(c);
			f3|=Character.isUpperCase(c);
		}
		println(f1&&f2&&f3&&s.length()>=6?"VALID":"INVALID");
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}