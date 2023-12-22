import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, i, count[] = new int[26];
		String str = "", str1="", eng = "abcdefghijklmnopqrstuvwxyz";
		char c;
		
		while(scan.hasNext()){
			str1=scan.next();
			str+=str1;
		}
		str = str.toLowerCase();
		n = str.length();
		for (i = 0; i < 26; i++) {
			count[i] = 0;
		}
		for (i = 0; i < n; i++) {
			c = str.charAt(i);
			switch (c) {
			case 'a':
				count[0]++;
				break;
			case 'b':
				count[1]++;
				break;
			case 'c':
				count[2]++;
				break;
			case 'd':
				count[3]++;
				break;
			case 'e':
				count[4]++;
				break;
			case 'f':
				count[5]++;
				break;
			case 'g':
				count[6]++;
				break;
			case 'h':
				count[7]++;
				break;
			case 'i':
				count[8]++;
				break;
			case 'j':
				count[9]++;
				break;
			case 'k':
				count[10]++;
				break;
			case 'l':
				count[11]++;
				break;
			case 'm':
				count[12]++;
				break;
			case 'n':
				count[13]++;
				break;
			case 'o':
				count[14]++;
				break;
			case 'p':
				count[15]++;
				break;
			case 'q':
				count[16]++;
				break;
			case 'r':
				count[17]++;
				break;
			case 's':
				count[18]++;
				break;
			case 't':
				count[19]++;
				break;
			case 'u':
				count[20]++;
				break;
			case 'v':
				count[21]++;
				break;
			case 'w':
				count[22]++;
				break;
			case 'x':
				count[23]++;
				break;
			case 'y':
				count[24]++;
				break;
			case 'z':
				count[25]++;
				break;
			default:
				break;
			}
		}
		for (i = 0; i < 26; i++) {
			System.out.println(eng.charAt(i) + " : " + count[i]);
		}
	}
}
