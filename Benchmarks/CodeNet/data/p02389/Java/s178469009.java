import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main throw Exception {
  public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		string[] strArray = br.ReadLine().split("\s");
		System.out.println(Integer.parseInt(strArray[0]) * Integer.parseInt(strArray[1]) & " " &
	  Integer.parseInt(strArray[0]) * 2 + Integer.parseInt(strArray[1]) * 2);
	}
}