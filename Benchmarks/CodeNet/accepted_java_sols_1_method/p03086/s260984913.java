import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String str = sc.next();
		for(int i = 0; i < str.length(); i++){
            for (int j = i+1; j<=str.length(); j++){
                list.add(str.substring(i,j));
            }
        }
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<list.size(); i++) {
			String tmp = list.get(i);
			int cnt = 0;
			for(int j=0; j<tmp.length(); j++) {
				if(tmp.charAt(j)=='A'||tmp.charAt(j)=='C'
						||tmp.charAt(j)=='G'||tmp.charAt(j)=='T') {
					cnt++;
				}else {
					break;
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
}
