import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main{
  public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArray;
		strArray = br.readLine().split("\\s");
		System.out.println(Integer.parseInt(strArray[0]) * Integer.parseInt(strArray[1]) +  " " + (Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1])) * 2);
	}
}