import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.nextLine();

		String[] strArray = str.split("");
		int ans = 0;

		for(int i = 0;i < strArray.length;i++){
			if(strArray[i].equals("x")){
				ans++;
			}
		}

		String ansStr = "YES";
		if(ans >=8){
			ansStr = "NO";
		}
		System.out.println(ansStr);
		
  
	}
}