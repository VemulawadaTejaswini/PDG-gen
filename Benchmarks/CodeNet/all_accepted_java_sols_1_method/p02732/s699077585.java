import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        Map<Integer, Long> map = new HashMap<>();
        for(int i = 0; i < n; i++){
        	int number = sc.nextInt();
            num[i] = number;
            if(map.containsKey(number)){
            	map.put(number, map.get(number) + 1);
            }else{
            	map.put(number, 1L);
            }
        }
        long total = 0;
        for(int key: map.keySet()){
            total += (map.get(key) * (map.get(key) - 1)) / 2;
        }
        for(int i = 0; i < n; i++){
        	long lb = (map.get(num[i]) * (map.get(num[i]) - 1)) / 2;
            long la = ((map.get(num[i]) - 1) * (map.get(num[i]) - 2)) / 2;
            System.out.println(total - lb + la);
        }
	}
}