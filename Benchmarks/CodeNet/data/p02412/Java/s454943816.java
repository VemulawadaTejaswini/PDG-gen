import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
class ToiN implements Toi{
	public void exec(String[] args){ solve(); }
	public void solve(){
		Tool tool = new Tool();

	}
}
  */

interface Toi {
	public void exec(String[] args);
}

public class Main {
	public static void main(String[] args) {
		Toi toi = new ToiRe26();
		toi.exec(args);
	}
}

class Tool {
	Scanner sc;
	
	public Tool() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextLong();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.next();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextByte();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(short[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextShort();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void zeroArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = 0;
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void zeroArray(byte[][][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				for (int k = 0; k < array[0][0].length; k++) {
					try {
						array[i][j][k] = 0;
					} catch (Exception e) {
						break;
					}
				}
			}
		}
	}
	
	public void zeroArray(boolean[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = false;
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void zeroArray(boolean[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = false;
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Tool17 extends Tool {
	Scanner sc;
	
	public Tool17() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
				if (i % 2 == 1 && array[i] == 0 && array[i - 1] == 0) {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void inputArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextInt();
				if (i % 2 == 1 && array[i] == 0 && array[i - 1] == 0) {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}

class testTool22 extends Tool {
	Scanner sc;
	String path;
	
	public testTool22(String path) throws FileNotFoundException {
		try {
			sc = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			return;
		}
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				try {
					String tmp = sc.next();
					if (tmp == null || tmp.equals("") || tmp.equals("\n")) {
						return;
					} else {
						if (j % 2 != 0) {
							array[j][i] = Integer.parseInt(tmp);
						} else {
							array[j][i] = (int) (tmp.charAt(0));
						}
						tmp = "";
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void inputArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextByte();
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Tool22 extends Tool {
	Scanner sc;
	String path;
	
	public Tool22() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				try {
					String tmp = sc.next();
					if (tmp == null || tmp.equals("") || tmp.equals("\n")) {
						return;
					} else {
						if (j % 2 != 0) {
							array[j][i] = Integer.parseInt(tmp);
						} else {
							array[j][i] = (int) (tmp.charAt(0));
						}
						tmp = "";
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void inputArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			try {
				array[i] = sc.nextByte();
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Tool23 extends Tool {
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
				} catch (Exception e) {
					break;
				}
			}
		}
	}
}

class Tool25 extends Tool {
	Scanner sc;
	
	public Tool25() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
					if (j == array[0].length - 1) {
						if (array[i][j] == -1 && array[i][j - 1] == -1 && array[i][j - 2] == -1) {
							return;
						}
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}
}

class Tool26 extends Tool25 {
	Scanner sc;
	
	public Tool26() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
					if (j == array[0].length - 1) {
						if (array[i][j] == 0 && array[i][j - 1] == 0) {
							return;
						}
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}
	
	public void initArray(int[][][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				for (int k = 0; k < array[0][0].length; k++) {
					try {
						array[i][j][k] = -1;
					} catch (Exception e) {
						break;
					}
				}
			}
		}
	}
	
	public void sort(int[] sortedArray, int a, int b, int c) {
		sortedArray[0] = a;
		sortedArray[1] = b;
		sortedArray[2] = c;
		int tmp;
		for (int i = 0; i < sortedArray.length - 1; i++) {
			for (int j = i + 1; j <= sortedArray.length - 1; j++) {
				if (sortedArray[i] > sortedArray[j]) {
					tmp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = tmp;
				}
			}
		}
	}
	
	public void sort(int[] sortedArray) {
		int tmp;
		for (int i = 0; i < sortedArray.length - 1; i++) {
			for (int j = i + 1; j <= sortedArray.length - 1; j++) {
				if (sortedArray[i] > sortedArray[j]) {
					tmp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = tmp;
				}
			}
		}
	}
}

class Tool27 extends Tool {
	public Tool27() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
	}
}

class Tool29 extends Tool {
	public Tool29() {
		sc = new Scanner(System.in);
	}
	
	public int inputArrayAndCount(String[] array) {
		sc.useDelimiter(",|\n");
		String tmp;
		int i;
		for (i = 0; i < array.length; i++) {
			try {
				tmp = sc.next();
				array[i] = tmp;
				if (tmp == null || tmp.equals("") || tmp.equals(".+*$")) {
					return i;
				}
			} catch (Exception e) {
				return i;
			}
		}
		return i;
	}
}

class Tool30 extends Tool {
	public Tool30() {
		sc = new Scanner(System.in);
	}
	
	public int inputArrayAndCount(String[] array) {
		String tmp;
		int i;
		for (i = 0; i < array.length; i++) {
			try {
				tmp = sc.next();
				if (tmp.equals("0")) {
					return i;
				}
				if (tmp == null || tmp.equals("")) {
					return i;
				}
				array[i] = tmp;
			} catch (Exception e) {
				return i;
			}
		}
		return i;
	}
}

class Tool31 extends Tool30 {
	Thread th;
	
	public Tool31() {
		sc = new Scanner(System.in);
		th = new Thread();
	}
	
	public int inputArrayAndCount(String[] array) {
		ToolSub31 sub = new ToolSub31(array);
		int i = 0;
		try {
			sub.start();
			th.sleep(300);
			sub.interrupt();
			while (!(array[i] == null)) {
				i++;
			}
		} catch (Exception e) {
			return i;
		}
		return i;
	}
}

class ToolSub31 extends Thread implements Runnable {
	String[] array;
	Scanner sc;
	
	public ToolSub31(String[] recivedArray) {
		sc = new Scanner(System.in);
		array = recivedArray;
	}
	
	public void run() {
		try {
			String tmp;
			int i;
			for (i = 0; i < array.length; i++) {
				try {
					tmp = sc.next();
					array[i] = tmp;
					if ((int) array[i].charAt(array[i].length() - 1) == (int) '.' && !sc.hasNext()) {
						break;
					}
				} catch (Exception e) {
					break;
				}
			}
		} catch (Exception e) {
			return;
		}
	}
}

class ToiRe26 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		int count = 0, a = 0;
		int[] nx = new int[2];
		Tool tool = new Tool();
		int[] countArray = new int[1000];
		for (int j = 0; j < countArray.length; j++) {
			countArray[j] = -1;
		}
		while (true) {
			tool.inputArray(nx);
			count = 0;
			if (nx[0] == 0 && nx[1] == 0) {
				break;
			}
			for (int i = 1; i <= nx[0] - 2; i++) {
				for (int j = i + 1; j <= nx[0] - 1; j++) {
					for (int k = j + 1; k <= nx[0]; k++) {
						if (i + j + k == nx[1]) {
							count++;
						}
					}
				}
			}
			countArray[a++] = count;
		}
		for (int i = 0; i < countArray.length; i++) {
			try {
				if (countArray[i] >= 0) {
					System.out.println(countArray[i]);
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Toi32 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool();
		String[] inputArray = new String[2];
		tool.inputArray(inputArray);
		char[][] individualArray = new char[2][100];
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray[i].length(); j++) {
				try {
					individualArray[i][j] = inputArray[i].charAt(j);
				} catch (Exception e) {
					break;
				}
			}
		}
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < inputArray[0].length(); i++) {
			count = 0;
			for (int j = i; j < inputArray[0].length() + i; j++) {
				if (j >= inputArray[0].length() - 1) {
					if (individualArray[0][i] == individualArray[1][j - inputArray[0].length() + 1]) {
						count++;
						flag = true;
						break;
					} else if (flag) {
						continue;
					}
				} else {
					if (individualArray[0][i] == individualArray[1][j]) {
						count++;
						flag = true;
						break;
					} else if (flag) {
						continue;
					}
				}
			}
			if (count >= inputArray[1].length()) {
				break;
			}
		}
		boolean resultFlag = false;
		if (count >= inputArray[1].length()) {
			resultFlag = true;
		}
		if (resultFlag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			System.out.println(count);
		}
	}
}

