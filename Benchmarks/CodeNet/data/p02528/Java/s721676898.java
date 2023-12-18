import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]){
		ArrayList<Integer> input = new ArrayList<Integer>();
		ArrayList<Integer> output = new ArrayList<Integer>();
		int inputNumber=0;//n
		String inputString = null;//S
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			inputNumber = Integer.parseInt(br.readLine());
			inputString = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input = StringToArrayList(inputString,inputNumber);
		output = Sorting(input,inputNumber);
		String outputString = "";
		for(int i=0;i<output.size();i++){
			if(i==output.size()-1){
				outputString +=output.get(i);
			}else{
				outputString += output.get(i)+ " ";
			}
		}
		System.out.println(outputString);
		//System.out.println(counter);
	}

	// convert type String to ArrayList
	private static ArrayList<Integer> StringToArrayList(String input, int number){
		ArrayList<Integer> output = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(input," ");// separated by Space
		for(int i=0;i<number;i++){
			output.add(Integer.parseInt(st.nextToken()));
		}
		return output;
	}
	//do sorting
	private static ArrayList<Integer> Sorting(ArrayList<Integer> input, int number){
		int separate1, separate2;
		ArrayList<Integer> tempList1 = new ArrayList<Integer>();
		ArrayList<Integer> tempList2 = new ArrayList<Integer>();
		ArrayList<Integer> newList1 = new ArrayList<Integer>();
		ArrayList<Integer> newList2 = new ArrayList<Integer>();
		if(number == 1){
			return input;
		}else if(number==2){
			if(input.get(0) > input.get(1)){
				int temp;
				temp = input.get(0);
				input.set(0,input.get(1));
				input.set(1,temp);
			}
			counter++;
			return input;
		}else{//number > 2
			if(number % 2==0){
				separate1 = number/2;
			}else{
				separate1 = number/2 ;
			}
			separate2 = number-separate1;
			for(int i=0;i<separate1;i++){
				tempList1.add(input.get(i));
			}
			for(int i=separate1;i<number;i++){
				tempList2.add(input.get(i));
			}
			newList1 = Sorting(tempList1,separate1);
			newList2 = Sorting(tempList2,separate2);
			int index=0;//index number of newList2
			for(int i=0;i<separate2;i++){// Extension for can't be used easily
				if(newList1.size()<index+1){
					newList1.add(index,newList2.get(i));
				}else if(newList2.get(i)<newList1.get(index)){
					newList1.add(index, newList2.get(i));
				}else{
					index++;
					i--;
				}
			}
			return newList1;
		}
	}
}