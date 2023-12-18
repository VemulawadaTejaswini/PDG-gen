

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
//		System.out.println("START");
		
		
		int dataSetNum = scan.nextInt();
		List<DataSet> dataSets = new ArrayList<DataSet>();
		
		for(int i = 0; i < dataSetNum; i++)
		{
			dataSets.add(new DataSet());
		}
		for(int i = 0; i < dataSetNum; i++)
		{
			System.out.println(dataSets.get(i).getAnswer());
		}

	}

	static class Method
	{
		int type; //0 for tan, 1 for fuku/compound
		double interest;
		int cost;
		DataSet dataSet;
			
		public Method(DataSet dataSet)
		{
//			System.out.println("Constructing method");
			
			type = scan.nextInt();
			interest = scan.nextDouble();
			cost = scan.nextInt();
			
//			type = Integer.parseInt(scan.next());
//			interest = Double.parseDouble(scan.next());
//			cost = Integer.parseInt(scan.next());
			this.dataSet = dataSet;
			
//			System.out.println("Method constructed: type " + type + " interest " + interest + " cost " + cost);
		}
		
		public int calculate()
		{
			double money = dataSet.startingMoney;
			double celengan = 0;
			
			double curInterest;
			
			for(int year = 0; year < dataSet.years; year++)
			{
				curInterest =  Math.floor(money * interest);
				
				if(type == 0)
				{
					celengan += curInterest;
				}
				else if(type == 1)
				{
					money += curInterest;
				}
				
				money -= cost;
			}
			
			return (int) (money + celengan);
		}
	}
	
	static class DataSet
	{
		double startingMoney;
		double years;
		List<Method> methods = new ArrayList<Method>();
		double numOfMethods;
		
		int answer;
		
		public int getAnswer()
		{
			return answer;
		}

		public DataSet()
		{
			startingMoney = scan.nextInt();
			years = scan.nextInt();
			numOfMethods = scan.nextInt(); 
			
			double biggestMoneyYet = -99999;
			for(int i = 0; i < numOfMethods; i++)
			{
				methods.add(new Method(this));
				
				int ret = methods.get(i).calculate();
				
				if(i == 0) {biggestMoneyYet = ret;}
				else
				{
					if(ret > biggestMoneyYet) {biggestMoneyYet = ret;}
				}
			}
			
			answer = (int) Math.floor(biggestMoneyYet);
			//constructor
		}
	}
}
