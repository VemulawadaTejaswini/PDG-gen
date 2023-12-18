import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main2 {
	public static void main(String[] args) throws IOException {
		//ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		//List<Integer> list = new ArrayList<Integer>();
		int[] list = new int[1000000];
		int i = 0;
		
		end: {
			while (true) {
				String str = br.readLine();
				switch (str.substring(0, 2)) {

				case "in":
					// insert????????????
					int insert = Integer.parseInt((String) str.subSequence(7, str.length()));
					//deque.add(insert);
					list[i] = insert;
					i++;
					
					break;

				case "ex":
					// extract????????????
					int max = -1;
					int indicater = 0;
					for(int j = 0; j < list.length; j++){
						if(max < list[j]){
							max = list[j];
							indicater = j;
						}
					}
					sb.append(max + "\n");
					list[indicater] = -1;
					break;
					
				case "en":
					//end??\??????????????????
					break end;
				}
			}
		}
		System.out.print(sb.toString());
	}
}