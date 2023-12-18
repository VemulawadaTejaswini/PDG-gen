import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TradeMangaer tm = new TradeMangaer(1000);
		//?????????????????????
		while(true){
			String str = br.readLine();
			if(str.equals("")){
				break;
			}
			String[] tmp = str.split(",");
			int id = Integer.parseInt(tmp[0]);
			int date = Integer.parseInt(tmp[1]);
			
			tm.addTrade(id, date, TradeMangaer.LAST_MONTH);
		}
		
		//?????????????????????
		while(true){
			String str = br.readLine();
			if(str == null){
				break;
			}
			String[] tmp = str.split(",");
			int id = Integer.parseInt(tmp[0]);
			int date = Integer.parseInt(tmp[1]);
			
			tm.addTrade(id, date, TradeMangaer.THIS_MONTH);
		}
		
		tm.printTrades();
	}

}

class TradeMangaer {
	private Customer[] customers;
	static int THIS_MONTH = 1;
	static int LAST_MONTH = 2;
	
	public TradeMangaer (int n){
		customers = new Customer[n];
		
		for(int i = 0; i < n; i++){
			customers[i] = new Customer();
		}
	}
	
	public void addTrade(int id, int date, int month){
		int index = indexOfCustomer(id);
		
		if(month == THIS_MONTH){
			customers[index].addTradeThisMonth();
		}
		else if(month == LAST_MONTH){
			customers[index].addTradeLastMonth();
		}
	}
	
	public int indexOfCustomer(int id){
		return id - 1;
	}
	
	public void printTrades(){
		for(int i = 0; i < customers.length ; i++){
			if(customers[i].twoMonthContinue()){
				customers[i].printTrades();
			}
		}
	}
}

class Customer {
	private int tradeLastMonth = 0;
	private int tradeThisMonth = 0;
	private int id;
	static int IDseed = 1;
	
	public Customer () {
		id = IDseed++;
	}
	
	public void addTradeLastMonth(){
		tradeLastMonth++;
	}
	
	public void addTradeThisMonth(){
		tradeThisMonth++;
	}
	
	public boolean twoMonthContinue(){
		if(tradeLastMonth > 0 && tradeThisMonth > 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printTrades(){
		System.out.println(id + " " +(tradeLastMonth+tradeThisMonth));
	}
}