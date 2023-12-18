
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		boolean flag = false;
		for(int i=0;i<n.length();i++){
			if((int)n.charAt(i) == (int)'7'){
				flag = true;
			}	
		}

		if(flag){
			System.out.println("Yes");
		}	
		else{
			System.out.println("No");
		}
	}
}