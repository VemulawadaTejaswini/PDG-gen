import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int canW;
		HashMap<Integer, Set<Treasure>> tMap = new HashMap<Integer, Set<Treasure>>();
		HashMap<Integer, Integer> pMap = new HashMap<Integer, Integer>();
		int c = 1;
		while ((canW = in.nextInt()) != 0) {
			int n = in.nextInt();
			tMap.clear();
			pMap.clear();
			Set<Treasure> emptySet = Collections.emptySet();
			tMap.put(Integer.valueOf(0), emptySet);
			pMap.put(Integer.valueOf(0), Integer.valueOf(0));
			for (int i = 0; i < canW; i++) {
				tMap.put(Integer.valueOf(i + 1), new HashSet<Treasure>());
				pMap.put(Integer.valueOf(i + 1), Integer.valueOf(0));
			}
			for (int i = 0; i < n; i++) {
				Treasure treasure = new Treasure(in.next());
				if (treasure.weght <= canW)
					for (int w = 0; w + treasure.weght <= canW; w++) {
						int setW = treasure.weght + w;
						Set<Treasure> sSet = tMap.get(Integer.valueOf(setW));
						int sPrice = pMap.get(Integer.valueOf(setW));
						Set<Treasure> baseSet = tMap.get(Integer.valueOf(w));
						int newPrice = pMap.get(Integer.valueOf(w))
								+ (baseSet.contains(treasure) ? 0
										: treasure.price);
						if (sPrice <= newPrice) {
							sSet.clear();
							sSet.addAll(baseSet);
							sSet.add(treasure);
							pMap.put(setW, newPrice);
						}

					}
			}
			int furoshikiW = 0;
			for (Treasure tr : tMap.get(canW)) {
				furoshikiW += tr.weght;
			}
			System.out.print("Case ");
			System.out.print(c++);
			System.out.println(':');
			System.out.println(pMap.get(canW));
			System.out.println(furoshikiW);
		}
	}
}

class Treasure {
	final int weght;
	final int price;

	public Treasure(String arg) {
		String[] param = arg.split(",");
		price = Integer.parseInt(param[0]);
		weght = Integer.parseInt(param[1]);
	}

	@Override
	public String toString() {
		return price + "-" + weght;
	}
}