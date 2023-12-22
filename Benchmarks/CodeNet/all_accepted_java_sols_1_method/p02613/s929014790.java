import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
      	Map<String, Integer> inputMap = new HashMap<String, Integer>();
      	inputMap.put("AC", 0);
      	inputMap.put("WA", 0);
        inputMap.put("TLE", 0);
      	inputMap.put("RE", 0);
      
      	List<String> inputList = new ArrayList<String>();
		for(int i=0;i<n;i++){
        	inputList.add(sc.next());
        }
        
        for(String str: inputList){
        	for(Map.Entry<String, Integer> entry: inputMap.entrySet()){
            	if( str.equals(entry.getKey())){
                	inputMap.replace(str, entry.getValue()+1);
                }
            }
        }

		// 出力
      	
        System.out.println("AC x "+inputMap.get("AC"));
        System.out.println("WA x "+inputMap.get("WA"));
        System.out.println("TLE x "+inputMap.get("TLE"));
        System.out.println("RE x "+inputMap.get("RE"));
	}
}