
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer;
		Deque<Integer> deque = new ArrayDeque<Integer>();
		String s;
		while((s=reader.readLine())!=null){
			int num = Integer.parseInt(s);
			if(num==0)
				System.out.println(deque.poll());
			else
				deque.push(num);
		}
	}

}