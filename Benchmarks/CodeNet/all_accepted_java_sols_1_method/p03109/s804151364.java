import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String[] date = scan.next().split("/",0);
		if(Integer.parseInt(date[0])<2019||Integer.parseInt(date[1])<5){
			System.out.println("Heisei");
		}else{
			System.out.println("TBD");
		}
	}
}