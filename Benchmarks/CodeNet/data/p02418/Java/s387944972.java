import java.io.*;
import java.util.*;

class Ring{
	String str1;

	Ring(String str1){
		this.str1 = str1 + str1;
	}
}

class Keyword{
	String str2;

	Keyword(String str2){
		this.str2 = str2;
	}
}

public class Main{
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Ring x = new Ring(br.readLine());
	Keyword y = new Keyword(br.readLine());

		if(x.str1.contains(y.str2)){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}