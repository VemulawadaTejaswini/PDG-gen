import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> eastList = new ArrayList<>();
		char[] actionArr = {'N', 'E', 'S', 'W'};
		Random random = new Random();
		try {
			String[] diceNumber = br.readLine().split("\\s");
			Dice01 dice01 = new Dice01(diceNumber);
			int q = Integer.parseInt(br.readLine());
			for (int i = 0; i < q; i++) {
				String[] topAndSouth = br.readLine().split("\\s");
				while(true) {
					
					dice01.rollDice(actionArr[random.nextInt(4)], diceNumber.length);
					if (dice01.takeTopNumber() == Integer.parseInt(topAndSouth[0])
							&& dice01.takeSouthNumber() == Integer.parseInt(topAndSouth[1])) {
						eastList.add(dice01.takeEastNumber());
						break;
					}
				}
			}
			for (int east: eastList) {
				System.out.println(east);
			}
			
		} catch (NumberFormatException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}


class Dice01 {
	private int number[];
	private int work[];

	public Dice01() {

	}

	public Dice01(String[] args) {
		number = new int[args.length];
		work = new int[args.length];
		// サイコロの初期化
		for (int i = 0; i < args.length; i++) {
			number[i] = Integer.parseInt(args[i]);
		}
	}

	public void rollDice(char action, int num) {
		for (int i = 0; i < num; i++) {
			this.work[i] = this.number[i];
		}

		switch (action) {
		case 'E':
			// West→Top, South→South, Top→East, Bottm→West, North→North, East→Bottom
			setNumber(work[3], work[1], work[0], work[5], work[4], work[2]);
			break;
		case 'N':
			// South→Top, Bottom→South, East→East, West→West, Top→Nouth, Nouth→Bottom
			setNumber(work[1], work[5], work[2], work[3], work[0], work[4]);
			break;
		case 'S':
			// North→Top, Top→South, East→East, West→West, Bottom→North, South→Bottom
			setNumber(work[4], work[0], work[2], work[3], work[5], work[1]);
			break;
		case 'W':
			// East→Top, South→South, Bottom→East, Top→West, North→North, West→Bottom
			setNumber(work[2], work[1], work[5], work[0], work[4], work[3]);
			break;
		default :
			break;
		}
	}

	public void setNumber(int n1, int n2, int n3, int n4, int n5, int n6) {
		this.number[0] = n1;
		this.number[1] = n2;
		this.number[2] = n3;
		this.number[3] = n4;
		this.number[4] = n5;
		this.number[5] = n6;
	}

	public int takeTopNumber() {
		return this.number[0];
	}
	
	public int takeSouthNumber() {
		return this.number[1];
	}
	
	public int takeEastNumber() {
		return this.number[2];
	}
}


