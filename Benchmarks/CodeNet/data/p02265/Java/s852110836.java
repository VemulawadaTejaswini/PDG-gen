import java.util.*;
import java.io.*;

public class Main {
	static final int EOF = StreamTokenizer.TT_EOF;
    static final int EOL = StreamTokenizer.TT_EOL;

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> seq = new ArrayList<Integer>();
		String command;
		String input;
		Integer num = 0;
		Integer count = Integer.parseInt(get());
		for(int i = 0; i < count; i++){
			input = get();
			if(input.length() == 19){
				break;
			}
			String[] input_array = input.split(" ");
			if(input_array.length == 1){
				command = input_array[0];
			}
			else{
				command = input_array[0];
				num = Integer.parseInt(input_array[1]);
			}
			if(command.equals("insert")){
				seq.add(0, num);
			}
			else if(command.equals("delete")){
				seq.remove(num);
			}
			else if(command.equals("deleteFirst")){
				seq.remove(0);
			}
			else if(command.equals("deleteLast")){
				seq.remove(seq.size() - 1);
			}
		}
		String output = "";
		for(int i = 0; i < seq.size(); i++){
			if(i == seq.size() - 1){
				output = output + seq.get(i);
			}
			else{
				output = output + seq.get(i) + " ";
			}
			if(output.length() > 1000){
				System.out.print(output);
				output = "";
			}
		}
		System.out.println(output);

	}
	private static String get() throws IOException{
		byte[] b = new byte[1]; 
		String c = "";
		String command = "";
		while(true){
			System.in.read(b);
			if(b[0] == 0 || b[0] == 10){
				break;
			}
			c = new String(b);
			command += c; 
		}
		
		return command.substring(0, command.length() - 1);
	}
}