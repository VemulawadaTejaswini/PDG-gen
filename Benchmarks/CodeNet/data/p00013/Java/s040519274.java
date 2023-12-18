import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<String> stack = new ArrayDeque<String>();
		String str;

		while((str=br.readLine()) != null){

			if(str.equals("0")){
				try{
					System.out.println(stack.pop());
				}catch(NoSuchElementException e){
					e.printStackTrace();
				}
			}else if(!str.equals("0")){
				stack.push(str);
			}

		}

	}
}