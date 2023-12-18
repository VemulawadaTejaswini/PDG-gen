import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		int count=0;
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			count++;
			try {
				i=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(i==0){
				break;
			}
			System.out.println("Case "+count+": "+i);
		}
	}
}