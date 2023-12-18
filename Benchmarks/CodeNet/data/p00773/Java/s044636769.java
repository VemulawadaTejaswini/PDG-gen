package aoj_1192;

import java.util.Scanner;
public class Main {

	int p_tax, a_tax, price, max, search_cnt;
	
	int MAX(int a, int b)
	{
		return (a > b) ? a : b;
	}
	
	int tax_calcurate(int tax, int left, int right)
	{
		return left * (100 + tax) / 100 + right * (100 + tax) / 100;
	}
	
	void Max_Search(int left, int right)
	{
		int tmp = 0, p_price;
		if( left <= right ){
			p_price = tax_calcurate(p_tax, left, right);
			if( p_price == price ) tmp = tax_calcurate( a_tax, left, right);
			max = MAX(max, tmp);
			
			if(( p_price == price && search_cnt <= price / 2) || (p_price < price && search_cnt <= price / 2))
				Max_Search(search_cnt++, price);
			else Max_Search( left, right - 1);
		}
	}
	
	void run()
	{
		Scanner scan = new Scanner(System.in);
		while(true){
			p_tax = scan.nextInt();
			a_tax = scan.nextInt();
			price = scan.nextInt();
			max = search_cnt = 1;
			
			if (p_tax == 0 && a_tax == 0 && price == 0) break;
			Max_Search(search_cnt, price);
			System.out.println(max);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}