import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<String> suite = new ArrayList<String>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		String n =scan.nextLine();
		while(scan.hasNext()){
			String x = scan.next();
			suite.add(x);
			int y = scan.nextInt();
			number.add(y);
		}
		
		for(int i=1; i!=14; i++ ){//???????????????1-13?????¢???
			for (int ii=0;ii<suite.size();ii++)
			{
				if(suite.get(ii) =='S' && number.get(ii) == number.get(i)){
					//???????????????????????¨??????
					break;
				}
				else{
					System.out.print(suite.get(i)+" "+number.get(i));
				}
			}
		}
	System.out.println("");
	}
}