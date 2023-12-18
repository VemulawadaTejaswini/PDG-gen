import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		NumberFinder finder = new NumberFinder();
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			finder.addNumbers(str);
		}
		
		System.out.println(finder.getSum());
	}

}

class NumberFinder {
	ArrayList<Integer> array = new ArrayList<Integer>();
	
	public void addNumbers(String str){
		String[] tmpArray = str.split("\\D+", -1);
		
		for(int i = 0; i < tmpArray.length ; i++){
			if(!tmpArray[i].equals("")){
				array.add(Integer.parseInt(tmpArray[i]));
			}
		}
	}
	
	public int getSum(){
		int sum = 0;
		for(int i = 0 ; i < array.size(); i++){
			sum += array.get(i);
		}
		return sum;
	}
}