import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> h = new ArrayList<Integer>();
		ArrayList<Integer> w = new ArrayList<Integer>();
		ArrayList<String> strArray = new ArrayList<String>();
		String data;
		int count = 0;
		while(true) {
			strArray.add(br.readLine());
			data = strArray.get(strArray.size() - 1);
			if(data.equals("0 0")) {
				break;
			}
			count++;
		}
		
		for(int i = 0; i < strArray.size(); i++) {
			String s = strArray.get(i);
			String [] ary = s.split(" ", 0);
			h.add(Integer.parseInt(ary[0]));
			w.add(Integer.parseInt(ary[1]));
		}
		int cnt1 = 0, cnt2 = 0;
		for(int k = 0; k < count; k++) {
			for(int i = 0; i < h.get(k); i++) {
				for(int j = 0; j < w.get(k); j++) {
					if(cnt1 % 2 == 1) {
						if(cnt2 % 2 == 0){
							System.out.print('.');
						}else {
							System.out.print('#');
						}
					}else if(cnt1 % 2 == 0){
						if(cnt2 % 2 == 0){
							System.out.print('#');
						}else {
							System.out.print('.');
						}
					}
					cnt2++;
				}
				cnt2 = 0;
				cnt1++;
				System.out.println();
			}
			cnt1 = 0;
			System.out.println();
		}
	}

}