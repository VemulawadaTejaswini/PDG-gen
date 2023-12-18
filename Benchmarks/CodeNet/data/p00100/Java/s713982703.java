import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dataNum; 
		while((dataNum = Integer.parseInt(br.readLine())) != 0){
			Map<String,Integer> employeeInfo = new LinkedHashMap<>();
			for(int i = 0 ; i < dataNum ; i++){
				String line = br.readLine();
				String[] dividedLine = line.split(" ");
				Integer result;
				if(employeeInfo.containsKey(dividedLine[0])){
					result = employeeInfo.get(dividedLine[0]) + Integer.parseInt(dividedLine[1]) * Integer.parseInt(dividedLine[2]);
					employeeInfo.put(dividedLine[0],result);
				}else{
					result = Integer.parseInt(dividedLine[1]) * Integer.parseInt(dividedLine[2]);
					employeeInfo.put(dividedLine[0],result);
				}
			}
			
			boolean isDispNA = true;
			for(String key : employeeInfo.keySet()){
				 if(employeeInfo.get(key) >= 1000000){
					 System.out.println(key);
					 isDispNA = false;
				 }
			}
			if(isDispNA){
				 System.out.println("NA");
			}
		}
	}
}