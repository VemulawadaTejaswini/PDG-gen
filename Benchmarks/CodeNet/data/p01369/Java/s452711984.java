import java.io.*;
import java.util.*;

public class Main {
	ArrayList <Integer>output = new ArrayList<Integer>(0);
	String input = null;
	char input2[] = null;
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	int indexno = 0;
	int state = 0;//1:Left 2:Right
	int count = 0;
	public static void main(String[]args){
		Main prob = new Main();
		prob.Run();
	}
	public void Run(){
		while(true){
			try{
				input = read.readLine();
				if(input.equals("#")){
					break;
				}
				state = 0;
				count = 0;
				input2 = input.toCharArray();
				for(int z = 0;z < input2.length;z++){
//					System.out.println(input2[z]);
					if(input2[z] == 'h' || input2[z] == 'i'
							|| input2[z] == 'j'|| input2[z] == 'k'
							|| input2[z] == 'l'|| input2[z] == 'm'
							|| input2[z] == 'n'|| input2[z] == 'o'
							|| input2[z] == 'p'|| input2[z] == 'u'
							|| input2[z] == 'y'){
						if(state == 1)count++;
						state = 2;
					}else{
						if(state == 2)count++;
						state = 1;
					}
				}
				output.add(count);
			}catch(Exception e){
				
			}
		}
		for(int z = 0;z < output.size();z++){
			System.out.println(output.get(z));
		}
	}
}