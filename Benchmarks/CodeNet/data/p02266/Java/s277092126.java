import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();

		Stack<Character> stack = new Stack<Character>();
		ArrayList<Integer> lakes = new ArrayList<Integer>();
		int sumOfLakes = 0;

		for(int i = 0; i < inputStr.length() ; i++){
			//System.out.println(i);

			double areaOfLake = 0;
			if(inputStr.charAt(i) == '\\'){
				int currentDepth = 0;
				
				for(int j = i; j < inputStr.length() && j <= i + 100; j++){

					//System.out.println("j = " + j + "depth "+ currentDepth);
					if(inputStr.charAt(j) == '\\'){
						stack.push('\\');
						areaOfLake += currentDepth + 0.5;
						currentDepth++;
					}
					else if(inputStr.charAt(j) == '/'){
						stack.pop();
						currentDepth--;
						areaOfLake += currentDepth + 0.5;
					}
					else if(inputStr.charAt(j) == '_'){
						areaOfLake += currentDepth;
					}

					if(stack.isEmpty()){
						lakes.add((int)areaOfLake);
						sumOfLakes += (int)areaOfLake;
						i = j;
						break;
					}
				}
				
				stack.clear();
			}
		}
		
		System.out.println(sumOfLakes);
		
		if(lakes.size() != 0){
			System.out.print(lakes.size() + " ");
		}
		else{
			System.out.println(0);
		}
		for(int i = 0; i < lakes.size(); i++){
			System.out.print(lakes.get(i));
			if(i != lakes.size() - 1){
				System.out.print(" ");
			}
		}
		if(lakes.size() != 0){
			System.out.println();
		}
		
	}

}