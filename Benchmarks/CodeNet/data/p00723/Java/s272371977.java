
import java.util.*;
import java.io.*;
public class Main {
	ArrayList <Integer>output = new ArrayList<Integer>(0);
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	boolean inputend = false;
	String input = null;
	ArrayList <String> run = new ArrayList<String>(0);//?????????????????°
	int datalength = 0;
	public static void main(String []args){
		Main run = new Main();
		run.Run();
	}
	public void Run(){
			try{
				input = read.readLine();
				if(datalength == 0){
					datalength = Integer.parseInt(input);
					if(datalength == 0)System.exit(0);
				}
				for(int z = 0;z < datalength;z++){
					Cut(read.readLine());
					output.add(run.size());
					run = new ArrayList<String>(0);
				}
				for(int z = 0;z < datalength;z++){
					System.out.println(output.get(z));
				}
			}catch(IOException e){
				
			}
	}
	public void Cut(String input){
		int index = 1;
		for(;index < input.length();index++){
			String output1 = input.substring(0, index);
			String output2 = input.substring(index,input.length());
			String Revoutput1 = Rev(output1);
			String Revoutput2 = Rev(output2);
			Input_Run(Revoutput1+output2);
			Input_Run(Revoutput1+Revoutput2);
			Input_Run(output1+Revoutput2);
			Input_Run(output1+output2);
			Input_Run(Revoutput2+output1);
			Input_Run(Revoutput2+Revoutput1);
			Input_Run(output2+Revoutput1);
			Input_Run(output2+output1);
		}
	}
	public String Rev(String input){
		String output = "";
		for(int z = input.length()-1;z >= 0;z--){
			output += input.substring(z,z+1);
		}
		return output;
	}public void Input_Run(String input){
		if(!run.contains(input)){
			run.add(input);
		}
	}
}