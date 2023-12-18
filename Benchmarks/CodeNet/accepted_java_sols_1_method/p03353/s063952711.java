import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer>map=new TreeMap<>();
		String s=sc.next();
		int n=sc.nextInt();
		map.put(s, 0);
		for(int m=1;m<=n;m++) {
			for(int i=0;i+m<s.length()+1;i++) {
				map.put(s.substring(i,i+m),0);
			}
		}
		int count=0;
		for(String key:map.keySet()) {
				count++;
				if(count==n) {
					System.out.println(key);
				break;
				}
			}
		}
	}
