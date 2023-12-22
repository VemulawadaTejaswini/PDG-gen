import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int p;
		String strArray[];

		ArrayList<String> popList = new ArrayList<String>();
		ArrayList<Stack<String>> blockStack = new ArrayList<Stack<String>>();

		for(int i=0; i<n; i++){
			blockStack.add(new Stack<String>());
		}

		while(!(str=br.readLine()).equals("quit")){
			strArray = str.split(" ");

			if(strArray[0].equals("push")){
				p = Integer.parseInt(strArray[1])-1;
				blockStack.get(p).push(strArray[2]);
			}else if(strArray[0].equals("pop")){
				p = Integer.parseInt(strArray[1])-1;
				popList.add(blockStack.get(p).pop());
			}else if(strArray[0].equals("move")){
				int p1 = Integer.parseInt(strArray[1])-1;
				int p2 = Integer.parseInt(strArray[2])-1;
				blockStack.get(p2).push(blockStack.get(p1).pop());
			}
		}
		for(int i=0; i<popList.size(); i++){
			System.out.println(popList.get(i));
		}
	}
}