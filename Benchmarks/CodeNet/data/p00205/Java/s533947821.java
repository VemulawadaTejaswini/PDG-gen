import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		boolean x, y, z;
		a: while(true) {
			x = y = z = false;
			int a[] = new int[5];
			for (int i = 0; i < 5; i++) {
				a[i] = stdIn.nextInt();
				if (a[i] == 0)
					break a;
			}
			for (int i = 0; i < 5; i++) {
				if (a[i] == 1) {
					x=true;
				}
				if (a[i] == 2) {
					y=true;
				}
				if (a[i] == 3) {
					z=true;
				}
			}
			if ((x && y && z) || (x && !y && !z) || (!x && y && !z) || (!x && !y && z)) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("3");
                }
            } else {
                if (x && y && !z) {
                    for (int i = 0; i < 5; i++) {
                        if (a[i] == 1) {
                            System.out.println("1");
                        } else {
                            System.out.println("2");
                        }
                    }
                } else if (x && !y && z) {
                    for (int i = 0; i < 5; i++) {
                        if (a[i] == 3) {
                            System.out.println("1");
                        } else {
                            System.out.println("2");
                        }
                    }
                } else if (!x && y && z) {
                    for (int i = 0; i < 5; i++) {
                        if (a[i] == 2) {
                            System.out.println("1");
                        } else {
                            System.out.println("2");
                        }
                    }
                }
            }
        }
    }
}