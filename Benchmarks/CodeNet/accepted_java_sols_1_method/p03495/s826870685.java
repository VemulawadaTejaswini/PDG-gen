import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			Integer po = hash.get(a);
			if(po == null){
				po = 0;
			}
			hash.put(a, po+1);
		}
		for(Integer key:hash.keySet()){
			array.add(hash.get(key));
		}
		Collections.sort(array);
		int z = array.size() - k;
		int ans = 0;
		for(int i=0;i<z;i++){
			ans = ans + array.get(i);
		}
		System.out.println(ans);
	}
}
