import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static String[] list = new String[]{
		    "012345","024135","031425","043215","103254","120534",
		    "135024","152304","201453","215043","240513","254103",
		    "304152","310542","345012","351402","402351","425031",
		    "430521","453201","513240","521430","534120","542310"
	};
	static int h;
	static int w;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IN:while(true) {
			Dice[] data = new Dice[8];
			for(int i = 0; i < 8; i++) {
				String in = sc.next();
				if(in.equals("0")) break IN;
				data[i] = new Dice(in);
			}
			if(dfs(new Data(data))) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}

		}
	}
	
	static class Dice {
		char[] c;
		Dice() {
			c = new char[6];
		}
		Dice(String a) {
			c = a.toCharArray();
		}
		Dice(Dice a) {
			c = a.c;
		}
		void turnX() {
			char tmp = c[0];
			c[0] = c[1];
			c[1] = c[5];
			c[5] = c[4];
			c[4] = tmp;
		}
		void turnY() {
			char tmp = c[1];
			c[1] = c[3];
			c[3] = c[4];
			c[4] = c[2];
			c[2] = tmp;
		}
		void turnZ() {
			char tmp = c[0];
			c[0] = c[2];
			c[2] = c[5];
			c[5] = c[3];
			c[3] = tmp;
		}
	}
	
	static class Block {
		Dice[] list;
		int count = 0;
		Block() {
			list = new Dice[8];
		}
		Block(Block a) {
			list = Arrays.copyOf(a.list, a.list.length);
			count = a.count;
		}
		boolean set(Dice a) {
			list[count++] = new Dice(a);
			if(count == 1) {
				return true;
			}
			if(count == 2) {
				if(Character.toUpperCase(list[0].c[2]) == Character.toUpperCase(list[1].c[3]) && list[0].c[2] != list[1].c[3]) {
					return true;
				}
			}
			if(count == 3) {
				if(Character.toUpperCase(list[2].c[4]) == Character.toUpperCase(list[0].c[1]) && list[2].c[4] != list[0].c[1]) {
					return true;
				}
			}
			if(count == 4) {
				if(Character.toUpperCase(list[3].c[4]) == Character.toUpperCase(list[1].c[1]) && list[3].c[4] != list[1].c[1]) {
					if(Character.toUpperCase(list[3].c[3]) == Character.toUpperCase(list[2].c[2]) && list[3].c[3] != list[2].c[2]) {
						return true;
					}
				}
				
			}
			if(count == 5) {
				if(Character.toUpperCase(list[4].c[5]) == Character.toUpperCase(list[0].c[0]) && list[4].c[5] != list[0].c[0]) {
					return true;
				}
			}
			if(count == 6) {
				if(Character.toUpperCase(list[5].c[5]) == Character.toUpperCase(list[1].c[0]) && list[5].c[5] != list[1].c[0]) {
					if(Character.toUpperCase(list[5].c[3]) == Character.toUpperCase(list[4].c[2]) && list[5].c[3] != list[4].c[2]) {
						return true;
					}
				}
				
			}
			if(count == 7) {
				if(Character.toUpperCase(list[6].c[5]) == Character.toUpperCase(list[2].c[0]) && list[6].c[5] != list[2].c[0]) {
					if(Character.toUpperCase(list[6].c[4]) == Character.toUpperCase(list[4].c[1]) && list[6].c[4] != list[4].c[1]) {
						return true;
					}
				}
				
			}
			if(count == 8) {
				if(Character.toUpperCase(list[7].c[5]) == Character.toUpperCase(list[3].c[0]) && list[7].c[5] != list[3].c[0]) {
					if(Character.toUpperCase(list[7].c[3]) == Character.toUpperCase(list[6].c[2]) && list[7].c[3] != list[6].c[2]) {
						if(Character.toUpperCase(list[7].c[4]) == Character.toUpperCase(list[5].c[1]) && list[7].c[4] != list[5].c[1]) {
							return true;
						}
					}
				}
			}
			list[--count] = null;
			return false;
		}
	}
	static class Data {
		boolean[] useDice;
		Dice[] DiceList;
		Block block;
		Data(Dice[] a) {
			useDice = new boolean[8];
			DiceList = a;
			block = new Block();
		}
		Data(Data a) {
			useDice = Arrays.copyOf(a.useDice, a.useDice.length);
			DiceList = a.DiceList;
			block = new Block(a.block);
		}
	}

	static boolean dfs(Data a) {
		if(a.block.count == 8) {
			return true;
		}
		for(int i = 0; i < 8; i++) {
			if(a.useDice[i]) {
				continue;
			}
			for(int j = 0; j < 24; j++) {
				Dice tmp = new Dice();
				for(int k = 0; k < 6; k++) {
					tmp.c[k] = a.DiceList[i].c[list[j].charAt(k) - '0']; 
				}
				if(a.block.set(tmp)) {
					if(a.block.count == 8) return true;
					a.useDice[i] = true;
					dfs(a);
					a.useDice[i] = false;
					a.block.list[--a.block.count] = null;
				}
			}
		}
		return false;
		
	}

	

}