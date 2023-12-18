import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){
		LinkedList<String> used = new LinkedList<String>();
		String my = "aaaa";
		
		for(int s = 1;;s++){
			System.out.println("?" + my);
			System.out.flush();
			String buffer = sc.next();
			if(!buffer.startsWith("a")){
				System.out.println("!OUT");
				System.out.flush();
				return;
			}
			if(used.contains(buffer)){
				System.out.println("!OUT");
				System.out.flush();
				return;
			}
			used.add(buffer);
			
			char ch = buffer.charAt(buffer.length()-1);
			int f = s/10;
			int se= s%10;
			my = String.valueOf(ch) + String.valueOf((char) (f + 'a'))+String.valueOf((char) (se + 'a'))+"a"; 
		}
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}