import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int NUM_STUDENTS = 39;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		while((buf = br.readLine()) != null){
			System.out.println(getIDWithFlag(Integer.parseInt(buf)));
		}
	}
	public static String getIDWithFlag(int numCandy){
		int id = numCandy % NUM_STUDENTS;
		if(id == 0) id = 39;
		return "3C" + String.format("%02d", id);
	}
}