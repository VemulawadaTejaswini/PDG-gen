import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = Integer.parseInt(as.next());
		HashMap<String, String> hashmap = new HashMap<String, String>();
		String[] a;
		a = new String[n];
		for(int i=0;i<n;i++){
			a[i] = as.next();
			if(hashmap.get(a[i])==null){
				hashmap.put(a[i], "1");
			}else{
				int k = Integer.parseInt(hashmap.get(a[i]));
				k++;
				hashmap.put(a[i], String.valueOf(k));
			}
		}
		Collection<String> values = hashmap.values();
        Iterator<String> iteratorForValues = values.iterator();
        long kotae = 0;
        while(iteratorForValues.hasNext()) {
            long value = Long.parseLong(iteratorForValues.next());
           // System.out.println(value);
            kotae += value*(value-1)/2;
        }
        //System.out.println(kotae);
        for(int i=0;i<n;i++){
			int t = Integer.parseInt(hashmap.get(a[i]));
			//System.out.println("t="+t);
			System.out.println(kotae-2*(t-1)/2);
		}
	}
}