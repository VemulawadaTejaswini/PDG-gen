import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		final int n = scan.nextInt();
		String[] str = new String[n];
		String[] str1 = new String[n];
		int[] number = new int[n];
		
		for ( int i = 0; i < n; i++) {
			str[i] = scan.next();
			str1[i] = str[i];
			number[i] = scan.nextInt();
		}
		scan.close();
		
		QuickSort (str, number, 0, n - 1);
		
		boolean flg = isStable (str, str1, number);
		
		if (flg) System.out.println("stable");
		else System.out.println("Not stable");
		
		printArray (str, number);
		
	}
	
	static void QuickSort (String[] str, int[] data, int p, int r) {
		
		if (p < r) {
			int q = Partition (str, data, p, r);
			QuickSort (str, data, p, q - 1);
			QuickSort (str, data, q + 1, r);
		}
		
	}
	
	static int Partition (String[] str, int[] array, int p, int r) {
		int x = array[r];
		int i = p - 1;
		int temp;
		String strtemp;
		String strx = str[r];
		
		for (int j = p; j < r; j++) {
			if (array[j] <= x) {
				i++;
				temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				
				strtemp = str[j];
				str[j] = str[i];
				str[i] = strtemp;
			}
		}
		
		array[r] = array[i + 1];
		array[i + 1] = x;
		
		str[r] = str[i + 1];
		str[i + 1] = strx;
		
		return i + 1;
	}
	
	static boolean isStable(String[] str, String[] array, int[] number) {
		int n = number.length;
		
		for ( int i = 0; i < n - 1; i++ ) {
			for ( int j = i + 1; j < n - 1; j++) {
				if (number[i] == number[j]) {
					for ( int a = 0; a < n ; a++) {
						if ( str[i] == array[a]) {
							for (int b = 0; b < n ; b++) {
								if (str[j] == array[b]) {
									if ( a > b ) {
										return false;
									}
								}
							}
						}
					}
				}
			}
		}
		
		return true;
	}
	
	static void printArray (String[] str, int[] data) {
		int n = data.length;
		for (int i = 0; i < n; i++) {
			System.out.println(str[i] + " " + data[i]);
		}
	}
}

