import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    String res = "Good";
    
	if(s.charAt(0) == s.charAt(1)){
      res = "Bad";
    }
	if(s.charAt(1) == s.charAt(2)){
      res = "Bad";
    }
	if(s.charAt(2) == s.charAt(3)){
      res = "Bad";
    }
    System.out.print(res);
  }
}