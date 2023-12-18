import java.util.Scanner;

public class Main {
	static int a[][] = new int [8][8];

	public static int check(int x, int y, int k) {
		int sum = 0;

		int subsum = 0;
		for (int i = 1; x + i < 8; i++) {
			if (a[y][x + i] == 0) {
				break;
			}
			if (a[y][x + i] != k) {
				subsum++;
			} else {
				sum += subsum;
				break;
			}
		}
		subsum = 0;
		for (int i = 1; 0 <= x - i; i++) {
			if (a[y][x - i] == 0) {
				break;
			}
			if (a[y][x - i] != k) {
				subsum++;
			} else {
				sum += subsum;
				break;
			}
		}
		subsum = 0;
		for (int i = 1; y + i < 8; i++) {
			if (a[y + i][x] == 0) {
				break;
			}
			if (a[y + i][x] != k) {
				subsum++;
			} else {
				sum += subsum;
				break;
			}
		}
		subsum = 0;
		for (int i = 1; 0 <= y - i; i++) {
			if (a[y - i][x] == 0) {
				break;
			}
			if (a[y - i][x] != k) {
				subsum++;
			} else {
				sum += subsum;
				break;
			}
		}
		subsum = 0;
		for (int i = 1; x + i < 8 && y + i < 8; i++) {
			if (a[y + i][x + i] == 0) {
				break;
			}
			if (a[y + i][x + i] != k) {
				subsum++;
			} else {
				sum += subsum;
				break;
			}
		}
		subsum = 0;
		for (int i = 1; x + i < 8 && 0 <= y - i; i++) {
			if (a[y - i][x + i] == 0) {
				break;
			}
			if (a[y - i][x + i] != k) {
				subsum++;
			} else {
				sum += subsum;
				break;
			}
		}
		subsum = 0;
		for (int i = 1; 0 <= x - i&& y + i < 8; i++) {
			if (a[y + i][x - i] == 0) {
				break;
			}
			if (a[y + i][x - i] != k) {
				subsum++;
			} else {
				sum += subsum;
				break;
			}
		}
		subsum = 0;
		for (int i = 1; 0 <= x - i && 0 <= y - i; i++) {
			if (a[y - i][x - i] == 0) {
				break;
			}
			if (a[y - i][x - i] != k) {
				subsum++;
			} else {
				sum += subsum;
				break;
			}
		}
		return sum;
	}

	public static void reverse(int x, int y, int k) {
		int f = 0;
		for (int i = 1; x + i < 8; i++) {
			if (a[y][x + i] == 0) {
				break;
			}
			if (a[y][x + i] != k) {
				f++;
			} else {
				if (0 < f) {
					for (int j = 0; j < i; j++) {
						a[y][x + j] *= -1;
					}
				}
				break;
			}
		}
		f = 0;
		for (int i = 1; 0 <= x - i; i++) {
			if (a[y][x - i] == 0) {
				break;
			}
			if (a[y][x - i] == k) {
				for (int j = 0; j < i; j++) {
					a[y][x - j] *= -1;
				}
				break;
			}
		}
		f = 0;
		for (int i = 1; y + i < 8; i++) {
			if (a[y + i][x] == 0) {
				break;
			}
			if (a[y + i][x] != k) {
				f++;
			} else {
				if (0 < f) {
					for (int j = 0; j < i; j++) {
						a[y + j][x] *= -1;
					}
				}
				break;
			}
		}
		f = 0;
		for (int i = 1; 0 <= y - i; i++) {
			if (a[y - i][x] == 0) {
				break;
			}
			if (a[y - i][x] != k) {
				f++;
			} else {
				if (0 < f) {
					for (int j = 0; j < i; j++) {
						a[y - j][x] *= -1;
					}
				}
				break;
			}
		}
		f = 0;
		for (int i = 1; x + i < 8 && y + i < 8; i++) {
			if (a[y + i][x + i] == 0) {
				break;
			}
			if (a[y + i][x + i] != k) {
				f++;
			} else {
				if (0 < f) {
					for (int j = 0; j < i; j++) {
						a[y + j][x + j] *= -1;
					}
				}
				break;
			}
		}
		f = 0;
		for (int i = 1; x + i < 8 && 0 <= y - i; i++) {
			if (a[y - i][x + i] == 0) {
				break;
			}
			if (a[y - i][x + i] != k) {
				f++;
			} else {
				if (0 < f) {
					for (int j = 0; j < i; j++) {
						a[y - j][x + j] *= -1;
					}
				}
				break;
			}
		}
		f = 0;
		for (int i = 1; 0 <= x - i&& y + i < 8; i++) {
			if (a[y + i][x - i] == 0) {
				break;
			}
			if (a[y + i][x - i] != k) {
				f++;
			} else {
				if (0 < f) {
					for (int j = 0; j < i; j++) {
						a[y + j][x - j] *= -1;
					}
				}
				break;
			}
		}
		f = 0;
		for (int i = 1; 0 <= x - i && 0 <= y - i; i++) {
			if (a[y - i][x - i] == 0) {
				break;
			}
			if (a[y - i][x - i] != k) {
				f++;
			} else {
				if (0 < f) {
					for (int j = 0; j < i; j++) {
						a[y - j][x - j] *= -1;
					}
				}
				break;
			}
		}
		a[y][x] = k;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 8; i++) {
			String s = sc.next();
			for (int j = 0; j < 8; j++) {
				if (s.charAt(j) == 'x') {
					a[i][j] = -1;
				} else if (s.charAt(j) == 'o') {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}
			}
		}

		int mx, my, mr;
		int lx, ly, lr;
		boolean f = true;
		while (true) {
			mx = my = mr = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (a[i][j] == 0) {
						int k = check(j, i, 1);
						if (mr < k) {
							mx = j;
							my = i;
							mr = k;
						}
					}
				}
			}
			if (mr != 0) {
				reverse(mx, my, 1);
				f = true;
			} else {
				if (!f) {
					break;
				}
				f = false;
			}

			lx = ly = lr = 0;
			for (int i = 7; 0 <= i; i--) {
				for (int j = 7; 0 <= j; j--) {
					if (a[i][j] == 0) {
						int k = check(j, i, -1);
						if (lr < k) {
							lx = j;
							ly = i;
							lr = k;
						}
					}
				}
			}
			if (lr != 0) {
				reverse(lx, ly, -1);
				f = true;
			} else {
				if (!f) {
					break;
				}
				f = false;
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (a[i][j] == 1) {
					System.out.print('o');
				} else if (a[i][j] == -1) {
					System.out.print('x');
				} else {
					System.out.print('.');
				}
			}
			System.out.println();
		}
	}
}