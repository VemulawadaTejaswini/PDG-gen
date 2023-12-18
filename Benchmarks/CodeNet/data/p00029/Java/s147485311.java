import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> array = new ArrayList<String>();
		String str[] = sc.nextLine().split(" ");
		for(int i = 0;i < str.length;i++){
			for(int j = 0;j < array.size();j++){
				if(array.get(j).equals(str[i])){
					map.put(str[i],map.get(str[i]) + 1);
					break;
				}if(j == array.size()-1){
					if(array.get(j) != str[i]){
						array.add(str[i]);
						map.put(str[i], 0);
					}
				}
			}if(array.size() == 0){
				array.add(str[i]);
				map.put(str[i], 1);
			}
		}
		int max = 0;
		String maxw = "";
		String lon = "";
		for(int i = 0;i < array.size();i++){
			if(array.get(i).length() > lon.length()){
				lon = array.get(i);
			}if(map.get(array.get(i)) > max){
				max = map.get(array.get(i));
				maxw = array.get(i);
			}
		}
		System.out.println(maxw+" "+lon);
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}