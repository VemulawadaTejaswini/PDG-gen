import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		for(int i = 0 ; i < str.length ; i ++){
			if(str[i].equals("apple")){
				str[i]="peach";
			}
			else if(str[i].equals("peach")){
				str[i]="apple";
			}
		}
		for(int i = 0 ; i < str.length-1 ; i ++){
			System.out.print((i==str.length)?str[i]:str[i]+" ");
		}
		System.out.println("peach.");
	}
}