import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private ArrayList<Trump> cardList;
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    Main main = new Main();
	    main.init();

	    int n = Integer.parseInt(br.readLine());

	    for (int i = 0; i < n; i++) {
		    String line = br.readLine();
		    String type = line.split(" ")[0];
		    int num = Integer.parseInt(line.split(" ")[1]);
		    main. havingCardCheck(type, num);
	    }

	    main.notHavingCardDisp();
	}

	private void notHavingCardDisp() {
		for (int i = 0; i < cardList.size(); i++) {
			if (!cardList.get(i).having) {
				System.out.println(cardList.get(i).type + " " + cardList.get(i).num);
			}
		}
	}

	private void havingCardCheck(String type, int num) {
		for (int i = 0; i < cardList.size(); i++) {
			if (cardList.get(i).type.equals(type) && cardList.get(i).num == num) {
				cardList.get(i).having = true;
				return;
			}
		}
	}

	private void init() {
		cardList = new ArrayList<Trump>();
		cardList.add(new Trump("S", 1));
		cardList.add(new Trump("S", 2));
		cardList.add(new Trump("S", 3));
		cardList.add(new Trump("S", 4));
		cardList.add(new Trump("S", 5));
		cardList.add(new Trump("S", 6));
		cardList.add(new Trump("S", 7));
		cardList.add(new Trump("S", 8));
		cardList.add(new Trump("S", 9));
		cardList.add(new Trump("S", 10));
		cardList.add(new Trump("S", 11));
		cardList.add(new Trump("S", 12));
		cardList.add(new Trump("S", 13));

		cardList.add(new Trump("H", 1));
		cardList.add(new Trump("H", 2));
		cardList.add(new Trump("H", 3));
		cardList.add(new Trump("H", 4));
		cardList.add(new Trump("H", 5));
		cardList.add(new Trump("H", 6));
		cardList.add(new Trump("H", 7));
		cardList.add(new Trump("H", 8));
		cardList.add(new Trump("H", 9));
		cardList.add(new Trump("H", 10));
		cardList.add(new Trump("H", 11));
		cardList.add(new Trump("H", 12));
		cardList.add(new Trump("H", 13));

		cardList.add(new Trump("C", 1));
		cardList.add(new Trump("C", 2));
		cardList.add(new Trump("C", 3));
		cardList.add(new Trump("C", 4));
		cardList.add(new Trump("C", 5));
		cardList.add(new Trump("C", 6));
		cardList.add(new Trump("C", 7));
		cardList.add(new Trump("C", 8));
		cardList.add(new Trump("C", 9));
		cardList.add(new Trump("C", 10));
		cardList.add(new Trump("C", 11));
		cardList.add(new Trump("C", 12));
		cardList.add(new Trump("C", 13));

		cardList.add(new Trump("D", 1));
		cardList.add(new Trump("D", 2));
		cardList.add(new Trump("D", 3));
		cardList.add(new Trump("D", 4));
		cardList.add(new Trump("D", 5));
		cardList.add(new Trump("D", 6));
		cardList.add(new Trump("D", 7));
		cardList.add(new Trump("D", 8));
		cardList.add(new Trump("D", 9));
		cardList.add(new Trump("D", 10));
		cardList.add(new Trump("D", 11));
		cardList.add(new Trump("D", 12));
		cardList.add(new Trump("D", 13));
	}

	class Trump {
		Trump(String type, int num) {
			this.type = type;
			this.num = num;
			this.having = false;
		}

		private String type;
		private int num;
		private boolean having;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public boolean isHaving() {
			return having;
		}
		public void setHaving(boolean having) {
			this.having = having;
		}
	}
}