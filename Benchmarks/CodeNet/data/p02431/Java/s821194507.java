import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
				int num_query = Integer.parseInt(br.readLine());

				ArrayList<String> list = new ArrayList<String>();
				StringBuilder ans = new StringBuilder();

				for(int loop = 0; loop < num_query; loop++){

					String input_str[] = br.readLine().split("\\s+");

					switch(input_str[0]){
					case "0":

						list.add(input_str[1]);
						break;

					case "1":

						ans.append(list.get(Integer.parseInt(input_str[1]))).append("\n");
						break;

					case "2":
						list.remove(list.size()-1);
						break;
					}
				}

				System.out.print(ans.toString());

			} catch (NumberFormatException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
}

class UTIL{

	//文字が半角数字か判定する関数
	public static boolean isNumber(String tmp_str){

		if(tmp_str == null || tmp_str.length() == 0){

			return false;
		}

		Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
		Matcher matcher = pattern.matcher(tmp_str);
		return matcher.matches();
	}
}
