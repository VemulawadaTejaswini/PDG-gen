
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String temp= "";
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			int prenum = str.charAt(0) - '0';
			if(prenum >= 0 && prenum <= 9){
				temp += ""+prenum;
			}
			for(int i=1; i < str.length(); i++){
				int num = str.charAt(i) - '0';
				if(num >= 0 && num <= 9){
					temp += ""+num;
				}
				else if(prenum >= 0 && prenum <= 9){
					//ツ青エツ算ツづーツつキツづゥ
					sum += Integer.parseInt(temp);
					temp = "";
				}
				else{}
				prenum = num;
			}
			if(temp.length() > 0){
				sum += Integer.parseInt(temp);
			}
		}

		System.out.println(sum);



	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}