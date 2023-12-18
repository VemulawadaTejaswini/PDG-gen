
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{

	static Scanner scanna = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
//		System.out.println("START");
		
		
		int dataSetNum = 4;
		List<DataSet> dataSets = new ArrayList<DataSet>();
			dataSets.add(new DataSet());
			dataSets.add(new DataSet());

	}


	static class DataSet
	{
		Scanner scan = new Scanner(System.in);
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
			scanna.nextInt();

			
		}
		
		public DataSet()
		{
			takeIn();

			//constructor
		}
	}
}
