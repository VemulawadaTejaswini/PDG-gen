import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<String> list = new ArrayList<>();
		for(int i=0;i<N;i++){
			String str = sc.next();
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String sortedStr = new String(chars);
			list.add(sortedStr);
		}
		Collections.sort(list);
		String tmp = list.get(0);
		long sum = 0;
		long count = 1;
		for(int i=1;i<N;i++){
			if(tmp.equals(list.get(i))){
				sum += count++;
			}
			else{
				count = 1;
			} 
			tmp = list.get(i);
		}
		System.out.println(sum);
	}
}