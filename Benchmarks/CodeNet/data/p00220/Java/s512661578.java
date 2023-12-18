import java.math.BigDecimal;
import java.util.Scanner;
class Main {
	public static void main(String[] args){
		double num;
		Scanner sc = new Scanner(System.in);
		Doctor d;
		
		while(true){
			num = sc.nextDouble();
			if(num < 0){
				break;
			}
			d = new Doctor(num);
			if(d.judge()){
				System.out.println(d.getBD());
			}else{
				System.out.println("NA");
			}
		}
	}
}

class Doctor {
	double num;
	String bd;
	int integers;
	double decimals;
	
	Doctor(double num){
		this.num = num;
		bd = "";
		integers = (int)num;
		decimals = new BigDecimal(num - integers).setScale(4, BigDecimal.ROUND_UP).doubleValue();
	}
	
	public boolean judge(){
		if(integers>255 || decimals>0.9375){
			return false;
		}
		return true;
	}
	
	private boolean toBinaryDigits(){
		String tmp = "";
		int count = 1;
		
		for(int i=integers;i>0;i/=2){
			tmp += i%2;
		}
		StringBuffer sb = new StringBuffer(tmp);
		for(int i=0;i<8-tmp.length();i++){
			bd += "0";
		}
		bd += sb.reverse().toString()+".";
		while(true){
			if(count > 4){
				return false;
			}
			decimals *= 2;
			if(decimals >= 1){
				decimals -=1;
				bd += "1";
				if(decimals == 0){
					for(int i=0;i<4-count;i++){
						bd += "0";
					}
					break;
				}
			}else{
				bd += "0";
			}
			count++;
		}
		
		return true;
	}
	
	public String getBD(){
		if(toBinaryDigits()){
			return bd;
		}
		return "NA";
	}
}