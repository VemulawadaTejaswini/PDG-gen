import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		SalesManager sm = new SalesManager();
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] tmpArray = str.split(",");
			int price = Integer.parseInt(tmpArray[0]);
			int num = Integer.parseInt(tmpArray[1]);
			sm.addQuery(price, num);
		}
		
		sm.printSumOfSales();
		sm.printAverage();
	}
}

class SalesManager {
	int queryNum = 0;
	int sumOfSalees = 0;
	int sumOfQuant = 0;
	
	public void addQuery(int price, int num){
		queryNum++;
		sumOfSalees += price * num;
		sumOfQuant += num;
	}
	
	public void printSumOfSales(){
		System.out.println(sumOfSalees);
	}
	
	public void printAverage(){
		int average = (int)Math.round((double)sumOfQuant/queryNum);
		System.out.println(average);
		
	}
}