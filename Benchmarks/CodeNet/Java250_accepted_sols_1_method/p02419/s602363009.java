import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String st = sc.readLine();
		int count = 0;
		flag:
		while(true){
			String[] s = sc.readLine().split(" ");
			for(String i:s){
				if(i.equals("END_OF_TEXT")){
					break flag;
				}else if(i.equalsIgnoreCase(st)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}