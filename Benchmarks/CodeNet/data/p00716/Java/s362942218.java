
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
//		System.out.println("START");
		
		Scanner scan = new Scanner(System.in);
		
		int dataSetNum = scan.nextInt();
		List<DataSet> dataSets = new ArrayList<DataSet>();
		
		for(int i = 0; i < dataSetNum; i++)
		{
			dataSets.add(new DataSet(scan));
		}
		for(int i = 0; i < dataSetNum; i++)
		{
			System.out.println(dataSets.get(i).getAnswer());
		}

	}


	static class DataSet
	{
		Scanner scan;
		int startingMoney;
		int years;
//		List<Method> methods = new ArrayList<Method>();
		int numOfMethods;
		
		int answer;
		
		public int getAnswer()
		{
			return answer;
		}

		void takeIn()
		{

			
		}
		
		public DataSet(Scanner scanny)
		{
			scan = scanny;
			takeIn();

			//constructor
		}
	}
}
