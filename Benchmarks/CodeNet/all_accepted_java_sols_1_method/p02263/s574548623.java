import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {

		//Scanner scan = new Scanner(System.in);

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String inputData = br.readLine();
		String data[] = inputData.split(" ");
		Deque<String> deque = new ArrayDeque<>();

		Pattern p = Pattern.compile("^[0-9]*$");
		for (int i = 0; i < data.length ; i++) {
			Matcher m = p.matcher(data[i]);
			if(m.find()) {
				deque.push(data[i]);
			}else {
				String b = deque.pop();
				String a = deque.pop();
				String r = "";
				switch(data[i]){
				case "+":
					r = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
					break;
				case "-":
					r = String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
					break;
				case "*":
					r = String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
					break;
				}
				deque.push(r);
			}
		}
		System.out.println(deque.pop());
	}

}

