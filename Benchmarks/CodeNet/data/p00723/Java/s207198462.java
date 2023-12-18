

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			new DataSet();
		}
	}
	
	static class DataSet
	{
		String original = "";
		String train1;
		String train2;
		List<String> traindex = new ArrayList<String>();
		
		
		public DataSet()
		{
			original = scan.next();
			
			for(int i = 1; i < original.length(); i++)
			{
				train1 = original.substring(0, i);
				train2 = original.substring(i);
				
				String rev1 = reverseStr(train1);
				String rev2 = reverseStr(train2);
//				System.out.println("Trains [" + train1 + "] and [" + train2 + "]");
				
				checkTrain(train1 + train2);
				checkTrain(rev1 + train2);
				checkTrain(train1 + rev2);
				checkTrain(rev1 + rev2);
				
				checkTrain(train2 + train1);
				checkTrain(rev2 + train1);
				checkTrain(train2 + rev1);
				checkTrain(rev2 + rev1);
			}
			
			System.out.println(traindex.size());
			//12.345
			//12.34
		}
		
		public String reverseStr(String str)
		{
			String ret = "";
			
			for(int i = str.length()-1; i >= 0; i--)
			{
				ret += str.substring(i, i+1);
			}
			
//			System.out.println("Reversing " + str + " into " + ret);
			return ret;
		}
		
		void checkTrain(String train)
		{
//			System.out.println("Checking " + train);
			if(!traindex.contains(train))
			{
//				System.out.println(">>> Added " + train);
				traindex.add(train);
			}
		}
	}

}

