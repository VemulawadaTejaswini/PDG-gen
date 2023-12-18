import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	private final static long[] _753 = {7L, 5L, 3L};

	public static void main(String[] args) {

		Scanner sysin = new Scanner(System.in);
		final long n = sysin.nextLong();
		sysin.close();

		// nの桁数を計算
		int r = 1;
		{
			long v = n;
			while (v > 10) {
				v /= 10;
				r++;
			}
		}

		// n桁の7.5.3で構成された数値を作る
		List<Long> shichigosan = new ArrayList<>();
		List<Long> shichigosan_now = new ArrayList<>();
		List<Long> shichigosan_before = Arrays.stream(_753).boxed().collect(Collectors.toList());
		for (int i = 1; i < r; i++) {
			shichigosan_now.clear();
			for (long lb : shichigosan_before) {
				for (long la : _753) {
					shichigosan_now.add(lb * 10 + la);
				}
			}
			shichigosan_before.clear();
			shichigosan_before.addAll(shichigosan_now);
			shichigosan.addAll(shichigosan_now);
		}

		// n以下で、7.5.3を含む数値の個数を出力する
		System.out.println(
			shichigosan.stream()
			.filter(e -> e <= n)
			.map(String::valueOf)
			.filter((String s) -> {
				boolean result = true;
				for (long l : _753) {
					result &= s.contains(Long.toString(l));
				}
				return result; })
			//.peek(System.out::println)
			.count()
		);
	}
}
