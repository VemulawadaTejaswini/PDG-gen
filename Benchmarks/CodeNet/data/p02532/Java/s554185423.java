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
		String strArray[];

		ArrayDeque<String> blocksStacks = new ArrayDeque<String>();//ブロックを入れるスタック
		ArrayList<String> popBlocks = new ArrayList<String>();
		ArrayList<ArrayDeque<String>> stacksList = new ArrayList<ArrayDeque<String>>();//n個のスタックを入れるリスト


		for(int i=0; i<n; i++){
			stacksList.add(i, blocksStacks);
		}

		while(!(str=br.readLine()).equals("quit")){
			strArray = str.split(" ");

			if(strArray[0].equals("push")){
				p = Integer.parseInt(strArray[1])-1;
				stacksList.get(p).push(strArray[2]);
			}else if(strArray[0].equals("pop")){
				p = Integer.parseInt(strArray[1])-1;
				popBlocks.add(stacksList.get(p).pop());
			}else if(strArray[0].equals("move")){
				int p1 = Integer.parseInt(strArray[1])-1;
				int p2 = Integer.parseInt(strArray[2])-1;

				String block = stacksList.get(p1).pop();
				stacksList.get(p2).push(block);
			}else{}
		}
		for(int i=0; i<popBlocks.size(); i++){
			System.out.println(popBlocks.get(i));
		}
	}
}