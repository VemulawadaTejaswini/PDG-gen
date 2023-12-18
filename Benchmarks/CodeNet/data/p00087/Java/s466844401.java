import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.script.ScriptException;

class Main {
	
	public void calculate(List<String> strangeList){
		List<Double> tmpList = new ArrayList<Double>();
		for(String element : strangeList){
			if(!element.equals("+") && !element.equalsIgnoreCase("-") && !element.equalsIgnoreCase("*") && !element.equalsIgnoreCase("/")){
				tmpList.add(Double.parseDouble(element));
			} else {
				double back		= tmpList.remove(tmpList.size() - 1);
				double front	= tmpList.remove(tmpList.size() - 1);
				double subResult = 0.0;
				switch(element){
				case "+":
					subResult = front + back;
					tmpList.add(subResult);
					break;
				case "-":
					subResult = front - back;
					tmpList.add(subResult);
					break;
				case "*":
					subResult = front * back;
					tmpList.add(subResult);
					break;
				case "/":
					subResult = front / back;
					tmpList.add(subResult);
					break;
				default:
					System.out.println("Something was wrong!");
				}
			}
		}
		if(tmpList.size() == 1){
			System.out.printf("%.6f\n",tmpList.get(0));
		} else {
			System.out.println("There is something wrong!");
		}

	}
	public static void main(String[] args) throws ScriptException{
		Main sme = new Main();
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String[] strs = input.nextLine().split(" ");
			List<String> strangeList = new ArrayList<String>(Arrays.asList(strs));
			sme.calculate(strangeList);
		}
		input.close();
	}
}