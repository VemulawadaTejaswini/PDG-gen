import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, q;
		Dice d = new Dice();
		try (Scanner sc = new Scanner(System.in)) {
			for(i = 0; i < 6; i++) {
				d.dice_make(i, sc.nextInt()); //diceの作成
			}
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				d.same(sc.nextInt(), sc.nextInt());
				System.out.println(d.getDice(2));
			}
		}
	}
}
class Dice{
	private int[] dice = new int[6];
	public void dice_make(int i, int dice_spot){
		dice[i] = dice_spot;
	}
	public void rotation(String direction) {
		switch(direction) {
		case "E": dice = new int[] {dice[3],dice[1],dice[0],dice[5],dice[4],dice[2]};break;
		case "N": dice = new int[] {dice[1],dice[5],dice[2],dice[3],dice[0],dice[4]};break;
		case "S": dice = new int[] {dice[4],dice[0],dice[2],dice[3],dice[5],dice[1]};break;
		case "W": dice = new int[] {dice[2],dice[1],dice[5],dice[0],dice[4],dice[3]};break;
		case "T": dice = new int[] {dice[0],dice[3],dice[1],dice[4],dice[2],dice[5]};break;
		default : dice = new int[] {};break;
		}
	}
	public boolean same(int a, int b) {
		int i = 0;
		for(i = 0; i < 6; i++) {
			if(i % 2 == 0) {
				rotation("E");
			}else {
				rotation("N");
			}
			if(dice[0] == a) {
				for(i = 0; i < 4; i++) {
					rotation("T");
					if(dice[1] == b) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public boolean compare(int[] diceA, int[] diceB) {
		int i, counter = 0;
		dice = diceA;
		if(same(diceB[0], diceB[1])) {
			for(i = 0; i < 6; i++) {
				if(dice[i] == diceB[i]) {
					counter++;
				}
			}
			if(counter == 6) {
				return true;
			}
		}
		return false;
	}
	public int getDice(int i) {
		return dice[i];
	}
	public int[] getDice_array() {
		return dice;
	}
}
