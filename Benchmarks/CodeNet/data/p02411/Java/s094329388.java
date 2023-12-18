
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws IOException{
		
		ArrayList<String> list = new ArrayList<String>();
		int count =0;
		while(true){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int tyuukan = Integer.parseInt(input[0]);
		int kimatu = Integer.parseInt(input[1]);
		int saisiken = Integer.parseInt(input[2]);
		
		if(tyuukan == -1 && kimatu == -1 && saisiken == -1){
			break;
		}else if(tyuukan + kimatu >= 80){
			list.add(count,"A");
		}else if(65<=tyuukan+kimatu && tyuukan+kimatu <80){
			list.add(count,"B");
		}else if(50<=tyuukan+kimatu && tyuukan+kimatu <65){
			list.add(count,"C");
		}else if(30<=tyuukan+kimatu && tyuukan+kimatu <50){
			if(saisiken <= 50){
				list.add(count,"C");
			}else{
				list.add(count,"D");
			}
		}else if(30>tyuukan+kimatu){
			list.add(count,"F");
		}else if(tyuukan == -1 || kimatu == -1){
			list.add(count,"F");
		}
		count++;
		}
		for ( int j=0;j<list.size();j++){
			String text = list.get(j);
			System.out.println(text);
			
		}
		
	}
}