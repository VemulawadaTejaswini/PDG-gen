
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Start");
		
		Scanner scan = new Scanner(System.in);
		
		int dataSetNum = scan.nextInt();
		List<DataSet> dataSets = new ArrayList();
		
		for(int i = 0; i < dataSetNum; i++)
		{
			dataSets.add(new DataSet());
		}

	}

	static class Method
	{
		Scanner scan = new Scanner(System.in);
		int type; //0 for tan, 1 for fuku/compound
		float interest;
		int cost;
		DataSet dataSet;
			
		public Method(DataSet dataSet)
		{
			System.out.println("Constructing method");
			
			type = Integer.parseInt(scan.next());
			interest = Float.parseFloat(scan.next());
			cost = Integer.parseInt(scan.next());
			this.dataSet = dataSet;
			
//			System.out.println("Method constructed: type " + type + " interest " + interest + " cost " + cost);
		}
		
		public int calculate()
		{
			int money = dataSet.startingMoney;
			int celengan = 0;
			
			int curInterest;
			
			for(int year = 0; year < dataSet.years; year++)
			{
				curInterest =  (int)((float)money * interest);
				
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
			
			return (money + celengan);
		}
	}
	
	static class DataSet
	{
		Scanner scan = new Scanner(System.in);
		int startingMoney;
		int years;
		List<Method> methods = new ArrayList();
		int numOfMethods;

		public DataSet()
		{
			startingMoney = scan.nextInt();
			years = scan.nextInt();
			numOfMethods = scan.nextInt(); 
			
			for(int i = 0; i < numOfMethods; i++)
			{
				methods.add(new Method(this));
				
				System.out.println(methods.get(i).calculate());
			}
			//constructor
		}
	}
}
