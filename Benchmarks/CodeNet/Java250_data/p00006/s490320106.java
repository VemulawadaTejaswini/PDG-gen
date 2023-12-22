import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Main {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		try{
		sb.append(new BufferedReader(new InputStreamReader(System.in)).readLine());
		} catch (Exception e){}
		sb.reverse();
		System.out.println(sb.toString());
	}
}