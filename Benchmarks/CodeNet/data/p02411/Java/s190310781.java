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
		Toi toi = new Toi25();
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

class Tool28 extends Tool {
	public Tool28() {
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

class Tool29 extends Tool {
	public Tool29() {
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

class Tool25 extends Tool{
	Scanner sc;
	public Tool25(){
		sc =new Scanner(System.in);
	}
	public void inputArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				try {
					array[i][j] = sc.nextInt();
					if(j == array[0].length - 1) {
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

class Tool30 extends Tool29 {
	Thread th;
	public Tool30() {
		sc = new Scanner(System.in);
		th = new Thread();
	}
	
	public int inputArrayAndCount(String[] array) {
		ToolSub30 sub = new ToolSub30(array);
		int i = 0;
		try {
			sub.start();
			th.sleep(300);
			sub.interrupt();
			while (!(array[i] == null)) {
				i++;
			}
		}catch (Exception e){
			return i;
		}
		return i;
	}
}

class ToolSub30 extends Thread implements Runnable{
	String[] array;
	Scanner sc;
	public ToolSub30(String[] recivedArray){
		sc = new Scanner(System.in);
		array = recivedArray;
	}
	public void run(){
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
		}catch (Exception e){
			return;
		}
	}
}


class Toi8 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int[] whxyr = new int[5];
		for (byte i = 0; i < whxyr.length; i++) {
			whxyr[i] = sc.nextInt();
		}
		calc(whxyr);
		int[] renewWh = {whxyr[0] - whxyr[4], whxyr[1] - whxyr[4], whxyr[2] + whxyr[4], whxyr[3] + whxyr[4]};
		if (renewWh[0] >= 0 && renewWh[1] >= 0 && renewWh[2] <= whxyr[0] && renewWh[3] <= whxyr[1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public void calc(int[] array) {
		int tmp;
		for (byte i = 0; i < array.length - 2; i++) {
			if (array[i + 2] < 0) {
				tmp = array[i];
				array[i] = array[i + 2];
				array[i + 2] = tmp;
			}
		}
		return;
	}
}

class Toi9 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		for (short i = 0; i < 1000; i++) {
			System.out.println("Hello World");
		}
	}
}

class Toi10 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		short[] tmp = new short[10000];
		Scanner sc = new Scanner(System.in);
		for (short i = 0; i < 10000; i++) {
			try {
				tmp[i] = sc.nextShort();
				if (tmp[i] == 0) {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
		for (short i = 1; i <= 10000; i++) {
			if (tmp[i - 1] == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + tmp[i - 1]);
		}
	}
}

class Toi11 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		short[] xy = new short[6000];
		Scanner sc = new Scanner(System.in);
		short point = 0;
		for (short i = 0; i < 3000; i++) {
			try {
				xy[i] = sc.nextShort();
				xy[i + 3000] = sc.nextShort();
			} catch (Exception e) {
				break;
			}
			if (xy[i] == 0 && xy[i + 3000] == 0) {
				point = i;
				break;
			}
		}
		for (short i = 1; i <= point; i++) {
			if (xy[i - 1] < xy[i + 3000 - 1]) {
				System.out.println(xy[i - 1] + " " + xy[i + 3000 - 1]);
			} else {
				System.out.println(xy[i + 3000 - 1] + " " + xy[i - 1]);
			}
		}
	}
}

class Toi12 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		short[] abc = new short[5];
		Scanner sc = new Scanner(System.in);
		for (byte i = 0; i < 3; i++) {
			abc[i] = sc.nextShort();
		}
		short[] f = new short[5000];
		for (short i = 0; i < 5000; i++) {
			f[i] = 0;
		}
		calc(abc[2], f);
		short count = 0;
		for (short i = 0; i < 5000; i++) {
			if (f[i] >= abc[0] && f[i] <= abc[1]) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println(count);
	}
	
	public void calc(short inputNum, short[] outputArray) {
		for (short i = 1, j = 0; i <= inputNum; i++) {
			if (inputNum % i == 0) {
				outputArray[j] = i;
				j++;
			}
		}
	}
}

class Toi13 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		int[] ab = new int[2];
		Tool tool = new Tool();
		tool.inputArray(ab);
		double[] cd = {ab[0], ab[1]};
		System.out.print(ab[0] / ab[1] + " " + ab[0] % ab[1] + " ");
		System.out.printf("%.5f\n", cd[0] / cd[1]);
	}
}

class Toi14 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		double r = (new Scanner(System.in).nextDouble());
		System.out.printf("%.6f", Math.pow(r, 2) * Math.PI);
		System.out.print(" ");
		System.out.printf("%.6f\n", r * 2. * Math.PI);
	}
}

class Toi15 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		String[] aOpB = new String[3];
		Tool tool = new Tool();
		int[] ab = new int[2];
		int i = 0;
		long[] solved = new long[1000];
		for (int j = 0; j < solved.length; j++) {
			solved[j] = (long) (Math.pow(20000, 2)) * (-1);
		}
		while (true) {
			tool.inputArray(aOpB);
			ab[0] = Integer.parseInt(aOpB[0]);
			ab[1] = Integer.parseInt(aOpB[2]);
			try {
				if (aOpB[1].equals("+")) {
					solved[i++] = ab[0] + ab[1];
				} else if (aOpB[1].equals("-")) {
					solved[i++] = ab[0] - ab[1];
				} else if (aOpB[1].equals("*")) {
					solved[i++] = ab[0] * ab[1];
				} else if (aOpB[1].equals("/")) {
					solved[i++] = ab[0] / ab[1];
				} else if (aOpB[1].equals("?")) {
					break;
				} else {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
		i = 0;
		while (true) {
			try {
				if (solved[i] > (long) (Math.pow(20000, 2)) * (-1)) {
					System.out.println(solved[i++]);
				} else {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}

class Toi16 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool();
		int[] n = new int[1];
		tool.inputArray(n);
		long[] a = new long[n[0]];
		tool.inputArray(a);
		long tmp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
					tmp = 0;
				}
			}
		}
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(a[0] + " " + a[a.length - 1] + " " + sum);
	}
}

class Toi17 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool17();
		int[] hw = new int[1000];
		tool.inputArray(hw);
		for (int h = 0; h < hw.length - 1; h += 2) {
			for (int i = 0; i < hw[h]; i++) {
				for (int j = 1; j <= hw[h + 1]; j++) {
					if (hw[h] == 0 && hw[h + 1] == 0) {
						break;
					}
					System.out.print("#");
				}
				if (hw[h] == 0 && hw[h + 1] == 0) {
					break;
				}
				System.out.println();
			}
			if (hw[h] == 0 && hw[h + 1] == 0) {
				break;
			}
			System.out.println();
		}
	}
}

class Toi18 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool17();
		long[] hw = new long[1000];
		tool.inputArray(hw);
		for (int h = 0; h < hw.length - 1; h += 2) {
			if (hw[h] == 0 && hw[h + 1] == 0) {
				break;
			}
			for (int i = 0; i < hw[h + 1]; i++) {
				System.out.print("#");
			}
			System.out.println();
			for (int i = 0; i < hw[h] - 2; i++) {
				System.out.print("#");
				for (int j = 1; j <= hw[h + 1] - 2; j++) {
					System.out.print(".");
				}
				System.out.print("#");
				if (hw[h] == 0 && hw[h + 1] == 0) {
					break;
				}
				System.out.println();
			}
			if (hw[h] == 0 && hw[h + 1] == 0) {
				break;
			}
			for (int i = 0; i < hw[h + 1]; i++) {
				System.out.print("#");
			}
			System.out.println();
			System.out.println();
		}
	}
}

class Toi19 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool17();
		int[] hw = new int[1000];
		tool.inputArray(hw);
		for (int h = 0; h < hw.length - 1; h += 2) {
			for (int i = 0; i < hw[h]; i++) {
				for (int j = 1; j <= hw[h + 1]; j++) {
					if (hw[h] == 0 && hw[h + 1] == 0) {
						break;
					}
					if (i % 2 == 0) {
						if (j % 2 != 0) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					} else {
						if (j % 2 != 0) {
							System.out.print(".");
						} else {
							System.out.print("#");
						}
					}
				}
				if (hw[h] == 0 && hw[h + 1] == 0) {
					break;
				}
				System.out.println();
			}
			if (hw[h] == 0 && hw[h + 1] == 0) {
				break;
			}
			System.out.println();
		}
	}
}

class Toi20 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool();
		int[] n = new int[1];
		int x;
		int[] y = new int[4];
		int z = 0;
		int zSum = 0;
		tool.inputArray(n);
		for (int i = 1; i <= n[0]; i++) {
			x = i;
			if (x % 3 == 0) {
				System.out.print(" " + x);
				continue;
			} else {
				z = 0;
				for (int j = 0; j < y.length; j++) {
					y[j] = 0;
					if (x % 10 == 3) {
						System.out.print(" " + (int) ((x * Math.pow(10, j)) + z));
						break;
					} else {
						z += (x - ((x / 10) * 10)) * (Math.pow(10, j));
						if ((x /= 10) > 0) {
							y[j]++;
							continue;
						} else {
							z = 0;
							break;
						}
					}
				}
			}
		}
		System.out.println();
	}
}

class Toi21 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool();
		byte[] n = new byte[1];
		tool.inputArray(n);
		short[] a = new short[n[0]];
		tool.inputArray(a);
		short tmp = 0;
		for (byte i = 0; i < a.length / 2; i++) {
			tmp = a[i];
			a[i] = a[a.length - (1 + i)];
			a[a.length - (1 + i)] = tmp;
		}
		for (byte i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[a.length - 1]);
	}
}

class Toi22 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		try {
			Tool tool = new Tool22();
			byte[] cardCount = new byte[1];
			tool.inputArray(cardCount);
			int[][] array = new int[2][cardCount[0]];
			tool.zeroArray(array);
			tool.inputArray(array);
			boolean[][] cardArray = new boolean[4][13];
			tool.zeroArray(cardArray);
			final int s = (int) ('S');
			final int h = (int) ('H');
			final int c = (int) ('C');
			final int d = (int) ('D');
			byte tmp;
			for (short i = 0; i < cardArray.length * cardArray[0].length; i++) {
				try {
					switch (array[0][i]) {
						case s:
							cardArray[0][array[1][i] - 1] = true;
							continue;
						case h:
							cardArray[1][array[1][i] - 1] = true;
							continue;
						case c:
							cardArray[2][array[1][i] - 1] = true;
							continue;
						case d:
							cardArray[3][array[1][i] - 1] = true;
							continue;
						default:
							continue;
					}
				} catch (Exception e) {
					continue;
				}
			}
			for (byte i = 0; i < cardArray.length; i++) {
				for (byte j = 1; j <= cardArray[0].length; j++) {
					if (!cardArray[i][j - 1] && i == 0) {
						System.out.println("S " + j);
					} else if (!cardArray[i][j - 1] && i == 1) {
						System.out.println("H " + j);
					} else if (!cardArray[i][j - 1] && i == 2) {
						System.out.println("C " + j);
					} else if (!cardArray[i][j - 1] && i == 3) {
						System.out.println("D " + j);
					}
				}
			}
		} catch (Exception e) {
			return;
		}
	}
}

class Toi23 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool23();
		int[] n = new int[1];
		tool.inputArray(n);
		int[][] bfrv = new int[n[0]][4];
		tool.zeroArray(bfrv);
		tool.inputArray(bfrv);
		byte[][][] count = new byte[4][3][10];
		tool.zeroArray(count);
		for (int i = 0; i < bfrv.length; i++) {
			count[bfrv[i][0] - 1][bfrv[i][1] - 1][bfrv[i][2] - 1] += bfrv[i][3];
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[0].length; j++) {
				for (int k = 0; k < count[0][0].length; k++) {
					if (count[i][j][k] >= 0) {
						System.out.print(" " + count[i][j][k]);
					} else {
						System.out.print(" " + 0);
					}
				}
				System.out.println();
			}
			if (i == count.length - 1) {
				break;
			}
			System.out.println("####################");
		}
	}
}

class Toi24 implements Toi{
	public void exec(String[] args){ solve(); }
	public void solve(){
		Tool tool = new Tool();
		int[] nm = new int[2];
		tool.inputArray(nm);
		int[][] a = new int[nm[0]][nm[1]];
		tool.inputArray(a);
		int[] b = new int[nm[1]];
		tool.inputArray(b);
		int[] c = new int[nm[1]];
		int sum = 0;
		for(int i = 0;i < nm[0];i++){
			sum = 0;
			for(int j = 0;j < nm[1];j++){
				sum += a[i][j] * b[j];
			}
			System.out.println(sum);
		}
	}
}

class Toi25 implements Toi{
	public void exec(String[] args){ solve(); }
	public void solve(){
		Tool tool = new Tool25();
		int[][] mfr = new int[50][3];
		char[] result = new char[50];
		tool.inputArray(mfr);
		int count = 0;
		for(int i = 0;i < result.length;i++){
			try{
				if(mfr[i][0] == -1 && mfr[i][1] == -1 && mfr[i][2] == -1){
					break;
				}else{
					count = i;
					if(mfr[i][0] == -1 || mfr[i][1] == -1){
						result[i] = 'F';
					}else if(mfr[i][0] + mfr[i][1] < 30){
						result[i] = 'F';
					}else if(mfr[i][0] + mfr[i][1] < 50 && mfr[i][2] < 50){
						result[i] = 'D';
					}else if(mfr[i][0] + mfr[i][1] < 50){
						result[i] = 'C';
					}else if(mfr[i][0] + mfr[i][1] < 65){
						result[i] = 'C';
					}else if(mfr[i][0] + mfr[i][1] < 80){
						result[i] = 'B';
					}else{
						result[i] = 'A';
					}
				}
			}catch (Exception e){
				break;
			}
		}
		for(int i = 0;i <= count;i++){
			System.out.println(result[i]);
		}
	}
}

class Toi28 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool28();
		String[] array = new String[1200];
		char[] charArray = new char[1200];
		int count = ((Tool28) tool).inputArrayAndCount(array);
		int subtraction = (int) ('a' - 'A');
		boolean aBiggerThanLargeA = false;
		if (subtraction >= 0) {
			aBiggerThanLargeA = true;
		}
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < charArray.length; j++) {
				try {
					if (aBiggerThanLargeA) {
						charArray[j] = array[i].charAt(j);
						if ((int) 'z' >= charArray[j] && (int) 'A' <= charArray[j]) {
							if ((int) charArray[j] >= (int) 'A' && (int) 'a' > (int) charArray[j]) {
								System.out.print((char) (charArray[j] + subtraction));
							} else if (charArray[j] == ' ' || charArray[j] == ',') {
								System.out.print(charArray[j]);
							} else if ((int) charArray[j] > (int) 'Z' && (int) 'z' >= (int) charArray[j]) {
								System.out.print((char) (charArray[j] - subtraction));
							}
						} else {
							System.out.print(charArray[j]);
							continue;
						}
						if (charArray[j] == '\n') {
							break;
						}
					} else {
						charArray[j] = array[i].charAt(j);
						if ((int) 'Z' >= charArray[j] && (int) 'a' <= charArray[j]) {
							if ((int) charArray[j] <= (int) 'Z' && (int) 'a' < (int) charArray[j]) {
								System.out.print((char) (charArray[j] + subtraction));
							} else if (charArray[j] == ' ' || charArray[j] == ',') {
								System.out.print(charArray[j]);
							} else if ((int) charArray[j] < (int) 'A' && (int) 's' <= (int) charArray[j]) {
								System.out.print((char) (charArray[j] - subtraction));
							}
						} else {
							System.out.print(charArray[j]);
							continue;
						}
						if (charArray[j] == '\n') {
							break;
						}
					}
				} catch (Exception e) {
					break;
				}
			}
			if (i == count - 1) {
				break;
			}
			System.out.print(",");
		}
		System.out.println();
	}
}

class Toi29 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool29();
		String[] lineArray = new String[100000];
		int counted = 0;
		counted = ((Tool29) tool).inputArrayAndCount(lineArray);
		char[][] charArray = new char[counted][1000];
		short[] count = new short[lineArray.length];
		short j;
		for (int i = 0; i < counted; i++) {
			for (j = 0; j < charArray[0].length; j++) {
				try {
					charArray[i][j] = lineArray[i].charAt(j);
				} catch (Exception e) {
					count[i] = j;
					break;
				}
				count[i] = j;
			}
		}
		int sum = 0;
		for (int i = 0; i < counted; i++) {
			for (j = 0; j <= count[i]; j++) {
				try {
					sum += Integer.parseInt(String.valueOf(charArray[i][j]));
				} catch (Exception e) {
					break;
				}
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}

class Toi30 implements Toi {
	public void exec(String[] args) {
		solve();
	}
	
	public void solve() {
		Tool tool = new Tool30();
		String[] lineArray = new String[10000];
		int counted = 0;
		counted = ((Tool30) tool).inputArrayAndCount(lineArray) + 1;
		char[][] charArray = new char[counted][1200];
		short[] count = new short[lineArray.length];
		short j;
		for (int i = 0; i < counted; i++) {
			for (j = 0; j < charArray[0].length; j++) {
				try {
					charArray[i][j] = lineArray[i].charAt(j);
				} catch (Exception e) {
					count[i] = j;
					break;
				}
				count[i] = j;
			}
		}
		int[][] alphabet = new int[52][2];
		tool.zeroArray(alphabet);
		for (int i = 0; i < alphabet.length / 2; i++) {
			alphabet[i][0] = (int) 'a' + i;
			alphabet[i + 26][0] = (int) 'A' + i;
		}
		for (int i = 0; i < counted; i++) {
			for (j = 0; j < charArray[0].length; j++) {
				try {
					for (int k = 0; k < alphabet.length / 2; k++) {
						if (charArray[i][j] == alphabet[k][0] || alphabet[k + 26][0] == charArray[i][j]) {
							alphabet[k][1]++;
						}
					}
				} catch (Exception e) {
					break;
				}
				count[i] = j;
			}
		}
		for (int i = 0; i < alphabet.length / 2; i++) {
			System.out.println((char) alphabet[i][0] + " : " + (alphabet[i][1]));
		}
	}
}
