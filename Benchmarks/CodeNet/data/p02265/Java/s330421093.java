import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	private static final int BIG_NUM  = 2000000000;
	private static final int MOD  = 1000000007;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input_str[] = new String[2];
		LinkedList<String> list = new LinkedList<String>();
		StringBuilder ans = new StringBuilder();

		try {
			int N = Integer.parseInt(br.readLine());

			for(int loop = 0; loop < N; loop++){
				input_str = br.readLine().split("\\s+");

				if(input_str[0].equals("insert")){
					list.addFirst(input_str[1]);
				}else if(input_str[0].equals("delete")){
					list.remove(input_str[1]);
				}else if(input_str[0].equals("deleteFirst")){
					list.removeFirst();
				}else if(input_str[0].equals("deleteLast")){
					list.removeLast();
				}
			}

			if(!list.isEmpty()){
				ans.append(list.getFirst());
				list.removeFirst();
			}
			while(!list.isEmpty()){
				ans.append(" ").append(list.getFirst());
				list.removeFirst();
			}

			System.out.print(ans.toString());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


