import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) {

		try {
	
			BufferedReader questionreader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter answerwriter = new PrintWriter(System.out);

			String answer = "A";
			
			String[] params = null;
			String question = null;

			while (questionreader.ready()) {
				if ("".equals(question = questionreader.readLine())) break;
				params = question.split(",");
				if (answer.equals(params[0])) answer = params[1];
				else if (answer.equals(params[1])) answer = params[0];
			}
			
			answerwriter.println(answer);
			
			answerwriter.close();
			questionreader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
}