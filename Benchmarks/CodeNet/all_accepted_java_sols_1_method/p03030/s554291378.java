import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		List<String> cities = new ArrayList<>();
		List<Integer> points = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			cities.add(sc.next());
			points.add(Integer.parseInt(sc.next()));
		}

		List<String> citiesInOrder = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (!citiesInOrder.contains(cities.get(i))) {
				citiesInOrder.add(cities.get(i));
				Collections.sort(citiesInOrder, Comparator.naturalOrder());
			}
		}

		for (int i = 0; i < n; i++) {
			String city = cities.get(i);

			points.set(i, (citiesInOrder.size() - (IntStream.range(0, citiesInOrder.size()).map(j -> citiesInOrder.get(j).equals(city) ? j : -1).filter(j -> j >= 0).min().getAsInt())) * 1000 + points.get(i));
		}

		List<Integer> pointsInOrder = points.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		List<Integer> ranks = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int point = points.get(i);

			ranks.add(IntStream.range(0, n).map(j -> pointsInOrder.get(j).equals(point) ? j : -1).filter(j -> j >= 0).min().getAsInt() + 1);
		}

		for (int i = 1; i <= n; i++) {
			int mokeke = i;

			System.out.println(IntStream.range(0, n)
										.map(j -> ranks.get(j).equals(mokeke) ? j : -1)
										.filter(j -> j >= 0).min().getAsInt() + 1);
		}



		sc.close();
	}
}