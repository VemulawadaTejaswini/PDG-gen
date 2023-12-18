import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		dataSentence(str);
		sc.close();

	}

	private static void dataSentence(String str) {
		String[] wds = str.split(" ");
		Map<String, Integer> wd_nums = new HashMap<String, Integer>();
		String most_freq_word = "";
		int most_freq_val = 0;

		String longest_word = "";
		int longest_word_val = 0;


		for (int i = 0; i < wds.length; i++) {

			if( wd_nums.get(wds[i]) == null) {
				wd_nums.put(wds[i], 1);
			} else {
				wd_nums.put(wds[i], wd_nums.get(wds[i]) + 1);
			}
		}

		for (int i = 0; i < wd_nums.size(); i++) {

			if (wd_nums.get(wds[i]) > most_freq_val) {
				most_freq_val = wd_nums.get(wds[i]);
				most_freq_word = wds[i];
			}

		}

		for (int i = 0; i < wds.length; i++) {

			if (wds[i].length()  > longest_word_val) {
				longest_word_val = wds[i].length();
				longest_word = wds[i];
			}

		}

		System.out.printf("%s %s\n", most_freq_word, longest_word);



	}

}
