import java.io.*;

class Main {
	public static void main(String[] args){
		int a, b, c;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String[] line = br.readLine().split(" ");
			a = Integer.parseInt(line[0]);
			b = Integer.parseInt(line[1]);
			c = Integer.parseInt(line[2]);
			
			if(a < b ){
			  if(b < c){
				System.out.println("Yes");
			  } else {
			  	System.out.println("No");
			  	}
			  } else {
				System.out.println("No");
			    }
		} catch(Exception e){
		}
	}
}