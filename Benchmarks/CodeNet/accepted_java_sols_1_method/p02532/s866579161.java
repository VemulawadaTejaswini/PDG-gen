import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int p;

		ArrayDeque<String> blockStack = new ArrayDeque<String>();
		ArrayList<ArrayDeque<String>> stacksStack = new ArrayList<ArrayDeque<String>>();
		ArrayList<String> popList = new ArrayList<String>();

		for(int i=0;i<n;i++){
			stacksStack.add(new ArrayDeque<String>());
		}

		while(!(str=br.readLine()).equals("quit")){
			String strArray[] = str.split(" ");

			if(strArray[0].equals("push")){
				p = Integer.parseInt(strArray[1])-1;
				stacksStack.get(p).push(strArray[2]);
			}else if(strArray[0].equals("pop")){
				p = Integer.parseInt(strArray[1])-1;
				popList.add(stacksStack.get(p).pop());
			}else if(strArray[0].equals("move")){
				int p1 = Integer.parseInt(strArray[1])-1;
				int p2 = Integer.parseInt(strArray[2])-1;

				stacksStack.get(p2).push(stacksStack.get(p1).pop());
			}else{}
		}
		for(int i=0;i<popList.size();i++){
			System.out.println(popList.get(i));
		}
	}
}