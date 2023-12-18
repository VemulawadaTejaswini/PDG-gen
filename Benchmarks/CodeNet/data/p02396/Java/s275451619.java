import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 Integer case_num = 1;
		 while(true){
			 String input = in.readLine();
			 if(input == "0"){
				 break;
			 }
			 if(input == null){
				 break;
			 }
			 System.out.println("Case " + case_num + ": " + input);
			 case_num += 1;
		 }
	}

}