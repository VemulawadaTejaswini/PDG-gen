

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ????????????????????°?????\???
		Scanner in = new Scanner(System.in);
		int dataSet = in.nextInt();

		// ????????????????????°?????????????????????
		for(int i = 0; i < dataSet; i++){

			// ?????????????????¨?¨????????????\???
			int height = in.nextInt();
			int width = in.nextInt();

			// ????????????????????????????´???????????¬??????????
			String[][] townMap = new String[height][width];

			// ???????????????????????????
			for(int j = 0; j < height; j ++){

				// ???????????????????????\???
				String mapData = in.next();

				// ??\????????????????????????????????????
				townMap[j] = mapData.split("");

			}

			// ??????????????????????????????
			int tankPositionH = 0;
			int tankPositionW = 0;

			for(int j = 0; j < height; j++) {

				for(int k = 0; k < width; k++) {

					if(townMap[j][k].equals("^") || townMap[j][k].equals("v")
							|| townMap[j][k].equals("<") || townMap[j][k].equals(">")) {

						tankPositionH = j;
						tankPositionW = k;

					}
				}
			}

			// ??????????????????????????°?????\???
			int commandCount = in.nextInt();

			// ??\????????????????????????1????????????????????????????????????????´?
			String commands = in.next();
			char[] commandArray = commands.toCharArray();

			// ?????????????????§???????????????
			Tank tank = new Tank();

			// ???????????°?????????????????????
			for(int j = 0; j < commandCount; j++){

				if(commandArray[j] == 'S'){

					// ?????????????????????????????§??????????????????
					tank.shoot(townMap, height, width, tankPositionH, tankPositionW);


				} else if(commandArray[j] == 'U' || commandArray[j] == 'D'){

					// ????????????????????????
					// String direction = tank.changeDirection(commandArray[j]);
					tankPositionH = tank.changeDirection(commandArray[j], townMap, height, width, tankPositionH, tankPositionW);

				} else {

					tankPositionW = tank.changeDirection(commandArray[j], townMap, height, width, tankPositionH, tankPositionW);


					// ????????????????????????????????¨??????????????´
					/*switch(direction) {

					case "^":

						if(tankPositionH != 0 && townMap[tankPositionH - 1][tankPositionW].equals(".")) {

							townMap[tankPositionH - 1][tankPositionW] = "^";
							townMap[tankPositionH][tankPositionW] = ".";

							tankPositionH = tankPositionH - 1;

						} else {

							townMap[tankPositionH][tankPositionW] = "^";

						}

						break;

					case "v":

						if(tankPositionH != height - 1 && townMap[tankPositionH + 1][tankPositionW].equals(".")) {

							townMap[tankPositionH + 1][tankPositionW] = "v";
							townMap[tankPositionH][tankPositionW] = ".";

							tankPositionH = tankPositionH + 1;

						} else {

							townMap[tankPositionH][tankPositionW] = "v";

						}

						break;

					case "<":

						if(tankPositionW != 0 && townMap[tankPositionH][tankPositionW - 1].equals(".")) {

							townMap[tankPositionH][tankPositionW - 1] = "<";
							townMap[tankPositionH][tankPositionW] = ".";

							tankPositionW = tankPositionW - 1;

						} else {

							townMap[tankPositionH][tankPositionW] = "<";

						}

						break;

					case ">":

						if(tankPositionW != width - 1 && townMap[tankPositionH][tankPositionW + 1].equals(".")) {

							townMap[tankPositionH][tankPositionW + 1] = ">";
							townMap[tankPositionH][tankPositionW] = ".";

							tankPositionW = tankPositionW + 1;

						} else {

							townMap[tankPositionH][tankPositionW] = ">";

						}

						break;
					}*/
				}
			}

			int j = 0;
			int k = 0;

			for(j = 0; j < height; j++) {

				for(k = 0; k < width; k++) {

					if(k < width - 1) {

						System.out.print(townMap[j][k]);

					} else {

						System.out.println(townMap[j][k]);

					}
				}
			}

			if(i < dataSet - 1) {

				System.out.println();

			}

		}
	}
}


// ???????????????
class Tank{

	// ?????????????????????????????????
	int changeDirection(char command, String[][] townMap, int height, int width, int tankPositionH, int tankPositionW){

		// String direction = null;
		int tankPosition = 0;

		switch(command){

		case 'U':

			if(tankPositionH != 0 && townMap[tankPositionH - 1][tankPositionW].equals(".")) {

				townMap[tankPositionH - 1][tankPositionW] = "^";
				townMap[tankPositionH][tankPositionW] = ".";

				tankPosition = tankPositionH - 1;

			} else {

				townMap[tankPositionH][tankPositionW] = "^";
				tankPosition = tankPositionH;

			}

			break;

		case 'D':

			if(tankPositionH != height - 1 && townMap[tankPositionH + 1][tankPositionW].equals(".")) {

				townMap[tankPositionH + 1][tankPositionW] = "v";
				townMap[tankPositionH][tankPositionW] = ".";

				tankPosition = tankPositionH + 1;

			} else {

				townMap[tankPositionH][tankPositionW] = "v";
				tankPosition = tankPositionH;

			}

			break;

		case 'L':

			if(tankPositionW != 0 && townMap[tankPositionH][tankPositionW - 1].equals(".")) {

				townMap[tankPositionH][tankPositionW - 1] = "<";
				townMap[tankPositionH][tankPositionW] = ".";

				tankPosition = tankPositionW - 1;

			} else {

				townMap[tankPositionH][tankPositionW] = "<";
				tankPosition = tankPositionW;

			}

			break;

		case 'R':

			if(tankPositionW != width - 1 && townMap[tankPositionH][tankPositionW + 1].equals(".")) {

				townMap[tankPositionH][tankPositionW + 1] = ">";
				townMap[tankPositionH][tankPositionW] = ".";

				tankPosition = tankPositionW + 1;

			} else {

				townMap[tankPositionH][tankPositionW] = ">";
				tankPosition = tankPositionW;

			}

			break;
		}

		return tankPosition;

	}

		/*case 'U':

			direction = "^";
			break;

		case 'D':

			direction = "v";
			break;

		case 'L':

			direction = "<";
			break;

		case 'R':

			direction = ">";
			break;

		}

		return direction;

	}*/

	void shoot(String[][] townMap, int height, int width, int tankPositionH, int tankPositionW) {

		switch(townMap[tankPositionH][tankPositionW]) {

		case "^":

			for(int i = tankPositionH - 1; i >= 0; i--) {

				if(townMap[i][tankPositionW].equals("#")) {

					break;

				} else if(townMap[i][tankPositionW].equals("*")) {

					townMap[i][tankPositionW] = ".";
					break;

				}
			}

			break;

		case "v":

			for(int i = tankPositionH + 1; i < height; i++) {

				if(townMap[i][tankPositionW].equals("#")) {

					break;

				} else if(townMap[i][tankPositionW].equals("*")) {

					townMap[i][tankPositionW] = ".";
					break;

				}
			}

			break;

		case "<":

			for(int i = tankPositionW - 1; i >= 0; i--) {

				if(townMap[tankPositionH][i].equals("#")) {

					break;

				} else if(townMap[tankPositionH][i].equals("*")) {

					townMap[tankPositionH][i] = ".";
					break;

				}
			}

			break;

		case ">":

			for(int i = tankPositionW + 1; i < width; i++) {

				if(townMap[tankPositionH][i].equals("#")) {

					break;

				} else if(townMap[tankPositionH][i].equals("*")) {

					townMap[tankPositionH][i] = ".";
					break;

				}
			}

			break;

		}
	}
}