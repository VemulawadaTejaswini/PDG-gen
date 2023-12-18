import java.util.Scanner;
public class Main {
private static Scanner s;
static int blen = 0;
static int[] b = new int[20];

public static void main(String[] args) {
	s = new Scanner(System.in);
	int a = s.nextInt(),c;

	for(int i = 0;i < a;i++) {
		b[i] = s.nextInt();
		blen++;
	}

	c = s.nextInt();
	int[] d = new int[200];
	for(int i = 0;i < c;i++) {
		d[i] = s.nextInt();
	}

	for(int i = 0;i < c;i++) {
		if(hantei(0,0,d[i])){
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}

public static boolean hantei(int j,int t,int di) {
	if(t == di) {
		return true;
	}
	for(int i = j;i < blen; i++) {
		if(hantei(i + 1, t + b[i], di)) {
			System.out.println(t + " "  + di);
			return true;
		}
	}
	return false;
	}
}
