import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = null;

		sc = new Scanner(System.in);
		try {

			//???????????°???????????????
			int input = Integer.parseInt(sc.next());
			for (int i = 0; i < input; i++) {

				//??????????????????
				int depth = sc.nextInt();
				int width = sc.nextInt();
				String[][] map = new String[depth][width];
				String line = "";//sc.nextLine();

				for (int j = 0; j < map.length; j++) {
					//?????????????????????
					line = sc.next();
					String[] list = line.split("");
					//????????????????´???????
					for (int k = 0; k < map[0].length; k++) {
						map[j][k] = list[k];
					}
				}
				//?????????????????????
				int commNum = Integer.parseInt(sc.next());
				line = sc.next();
				String[] command = line.split("");

				map = command(map,command);
				for (String[] gamemap : map) {
					for (String cel : gamemap) {
						System.out.print(cel);
					}
					System.out.println("");
				}

				if (i != input - 1) {
					System.out.println("");
				}
			}
		} finally {
			sc.close();
		}
	}
	//???????????????????????????????????????
	public static String[][] command(String[][] map, String[] comm) {

		int dep = 0;
		int wid = 0;
		String player = "";
		String[][] playmap;
		String[] command;

		playmap = map;
		command = comm;

			//?????????????????¨???????????????
		for (int i = 0; i < playmap.length; i++) {
			if (player.equals("")) {

				for (int j = 0; j < playmap[0].length; j++) {
					//?????????????????§??????
					if (playmap[i][j].equals("^")) {
						player = "^";
						dep = i;
						wid = j;
						break;
					}
					//???
					if (playmap[i][j].equals("v")) {
						player = "v";
						dep = i;
						wid = j;
						break;
					}
					//???
					if (playmap[i][j].equals(">")) {
						player = ">";
						dep = i;
						wid = j;
						break;
					}
					//???
					if (playmap[i][j].equals("<")) {
						player = "<";
						dep = i;
						wid = j;
						break;
					}
				}
			}
		}
		//?????????????????????
		for (int i = 0; i < command.length; i++) {
			//??????????????§????????????
			switch (command[i]) {
			case "U":
				playmap[dep][wid] = "^";
				player = "^";
				if (dep != 0 && playmap[dep - 1][wid].equals(".")) {
					playmap[dep - 1][wid] = playmap[dep][wid];
					playmap[dep][wid] = ".";
					dep--;
				}
				break;

			case "D":
				playmap[dep][wid] = "v";
				player = "v";
				if (dep != playmap.length - 1 && playmap[dep + 1][wid].equals(".")) {
					playmap[dep + 1][wid] = playmap[dep][wid];
					playmap[dep][wid] = ".";
					dep++;
				}
				break;

			case "R":
				playmap[dep][wid] = ">";
				player = ">";
				if (wid != playmap[0].length - 1 && playmap[dep][wid + 1].equals(".")) {
					playmap[dep][wid + 1] = playmap[dep][wid];
					playmap[dep][wid] = ".";
					wid++;
				}
				break;

			case "L":
				playmap[dep][wid] = "<";
				player = "<";
				if (wid != 0 && playmap[dep][wid - 1].equals(".")) {
					playmap[dep][wid - 1] = playmap[dep][wid];
					playmap[dep][wid] = ".";
					wid--;
				}
				break;

			case "S":
				//???????????????????????´???
				if (player.equals("^")) {
					int count = dep;
					for (int k = 0; k <= dep; k++) {
						if (playmap[count][wid].equals("*")) {
							playmap[count][wid] = ".";
							break;
						}else if (playmap[k][wid].equals("#")) {
							break;
						}
						count--;
					}
				}
				//???????????????????????´???
				else if (player.equals("v")) {
					for (int k = dep; k < playmap.length; k++) {
						if (playmap[k][wid].equals("*")) {
							playmap[k][wid] = ".";
							break;
						}else if (playmap[k][wid].equals("#")) {
							break;
						}
					}
				}

				//???????????????????????´???
				else if (player.equals(">")) {
					for (int k = wid; k < playmap[0].length; k++) {
						if (playmap[dep][k].equals("*")) {
							playmap[dep][k] = ".";
							break;
						}else if (playmap[dep][k].equals("#")) {
							break;
						}
					}
				}

				//???????????????????????´???
				else if (player.equals("<")) {
					int count = wid;
					for (int k = 0; k <= wid; k++) {
						if (playmap[dep][count].equals("*")) {
							playmap[dep][count] = ".";
							break;
						}else if (playmap[dep][count].equals("#")) {
							break;
						}
						count--;
					}
				}
				break;

			default:
				System.out.println("othercCommand");
				break;
			}
		}
		return playmap;

	}
}