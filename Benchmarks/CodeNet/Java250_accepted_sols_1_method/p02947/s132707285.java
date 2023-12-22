import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long count=0;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<n;i++) {
			String str = sc.next();
			char[] temp= str.toCharArray();
			Arrays.sort(temp);
			String str2=String.valueOf(temp);
			if(map.containsKey(str2)) {
				int temp2=map.get(str2);
				count+=temp2;
				map.put(str2,temp2+1);
			}else {
				map.put(str2, 1);
			}
		}
		sc.close();
		System.out.println(count);
	}
}