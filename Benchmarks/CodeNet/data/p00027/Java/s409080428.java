import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String[][] calender = new String[13][32]; // we can directory access to the date.
		
		make_calender(calender);
		
		while((s = br.readLine())!=null && !s.isEmpty())
		{
			int m = Integer.parseInt(s.split(" ")[0]);
			int d = Integer.parseInt(s.split(" ")[1]);
			
			if(m==0&&d==0) break;
			else 			System.out.println(calender[m][d]);
		}
	}
		
	private static void make_calender(String[][] calender)
	{
		String[] days = {"Thursday", "Friday" ,"Saturday", "Sunday","Monday", "Tuesday", "Wednesday"};
		Stack<String> temp = new Stack<String>();
		
	    // storing days from Jan 1st, Thursday.
		for(int i=0; i < 366; i++)
			temp.push(days[i%7]);
		//create calender
		for(int i=31; i>0; i--)
			calender[12][i] = temp.pop();
		for(int i=30; i>0; i--)
			calender[11][i] = temp.pop();
		for(int i=31; i>0; i--)
			calender[10][i] = temp.pop();
		for(int i=30; i>0; i--)
			calender[9][i] = temp.pop();
		for(int i=31; i>0; i--)
			calender[8][i] = temp.pop();
		for(int i=31; i>0; i--)
			calender[7][i] = temp.pop();
		for(int i=30; i>0; i--)
			calender[6][i] = temp.pop();
		for(int i=31; i>0; i--)
			calender[5][i] = temp.pop();
		for(int i=30; i>0; i--)
			calender[4][i] = temp.pop();
		for(int i=31; i>0; i--)
			calender[11][i] = temp.pop();
		for(int i=29; i>0; i--)
			calender[2][i] = temp.pop();
		for(int i=31; i>0; i--)
			calender[1][i] = temp.pop();	
	}	
}
	