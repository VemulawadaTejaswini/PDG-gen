import java.io.*;
public class Main{
	public static void main(String args[]){
    int x , y;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
			String line = reader.readLine();
      x = Integer.parseInt(line);
      y = x;
		}catch(Exception e){
      x = 0;
      y = 0;
    }
    for(int i = 1 ; i <= 2 ; i ++){

      x = x * y;
      
    }
		System.out.println((x));
	}
}
