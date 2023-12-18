import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	
	public static void main(String[] args) {

		try {
	
			BufferedReader questionreader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter answerwriter = new PrintWriter(System.out);

			String[] params = null;
			String question = null;

			while (questionreader.ready()) {
				if ("".equals(question = questionreader.readLine())) break;
				params = question.split(" ");
				answerwriter.println(Integer.parseInt(params[0])+Integer.parseInt(params[1]));
			}
			
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