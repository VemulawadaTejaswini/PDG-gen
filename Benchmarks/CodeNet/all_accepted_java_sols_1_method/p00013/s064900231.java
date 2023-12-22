import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> d = new ArrayDeque<>();

		String s ="";

		while((s = br.readLine()) !=null){
			int number = Integer.parseInt(s);

			if(number !=0){
				d.push(number);
			}else {
				System.out.println(d.pop());
			}

		}
	}



}