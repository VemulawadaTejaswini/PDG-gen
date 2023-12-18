public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();  //キーに対応する値にはキーの要素数を入れる
		int mapSize = 0;

		for(int i = 0; i < q; i++) {
			int query = sc.nextInt();

			switch(query) {
			case 0:
				int x = sc.nextInt();
				if(map.get(x) == null) {
					map.put(x, 1);
				}
				else map.replace(x, map.get(x) + 1);
				mapSize++;
				System.out.println(mapSize);
				break;

			case 1:
				x = sc.nextInt();
				if(map.get(x) == null) 	System.out.println(0);
				else System.out.println(map.get(x));
				break;

			case 2:
				x = sc.nextInt();
				if(map.get(x) != null) {
					mapSize -= map.get(x);
					map.remove(x);
				}
				break;

			case 3:
				int l = sc.nextInt();
				int r = sc.nextInt();

				for(int n : map.subMap(l, true, r, true).keySet()) {
					for(int j = 0; j < map.get(n); j++) {
						System.out.println(n);
					}
				}
				break;
			}
		}
	}

}

