import java.io.*;
import java.util.*;

public class Main {
	boolean balance = true;
	ArrayList <Boolean>output = new ArrayList <Boolean>(0);
	String input = "";
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	ArrayList <Integer> Flag= new ArrayList<Integer>(0);
	public static void main(String []args){
		Main run = new Main();
		run.Run();
	}
	public void Run(){
		while(true){
			try{
				input = read.readLine();
				char inputget[] = input.toCharArray();
				if(input.equals(".")){
					break;
				}
				balance = true;
				profile(inputget);
				output.add(balance);
				Flag.removeAll(Flag);
			}catch(Exception e){
				
			}
		}
		for(int z = 0;z < output.size() ;z++){
			if(output.get(z))System.out.println("yes");
			else System.out.println("no");
		}
	}

	public int profile(char inputget[]){
		for(int z = 0;z < inputget.length;z++){
			if(inputget[z] == '('){
				Flag.add(1);
			}if(inputget[z] == '['){
				Flag.add(2);
			}if(inputget[z] == ')'){
				if(Flag.contains(1) && Flag.lastIndexOf(2) < Flag.lastIndexOf(1)){
					Flag.remove(Flag.lastIndexOf(1));
				}else{
					balance = false;
					return 0;
				}
			}if(inputget[z] == ']'){
				if(Flag.contains(2) && Flag.lastIndexOf(1) < Flag.lastIndexOf(2)){
					Flag.remove(Flag.lastIndexOf(2));
				}else{
					balance = false;
					return 0;
				}
			}
		}
		if(Flag.size() != 0)balance = false;
		return 0;
	}
}