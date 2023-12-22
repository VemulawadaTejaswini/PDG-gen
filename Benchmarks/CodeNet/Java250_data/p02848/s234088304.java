import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	char[] a = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	StringBuilder sb = new StringBuilder();
	for (int i=0; i<s.length(); i++) {
	    sb.append(a[(re(s.charAt(i)) + n) % 26]);
	}
	System.out.print(sb.toString());
    }
    static int re(char is) {
	int r = 0;
	switch(is) {
	case 'A' : r = 0; break;
	case 'B' : r = 1; break;
	case 'C' : r = 2; break;
	case 'D' : r = 3; break;
	case 'E' : r = 4; break;
	case 'F' : r = 5; break;
	case 'G' : r = 6; break;
	case 'H' : r = 7; break;
	case 'I' : r = 8; break;
	case 'J' : r = 9; break;
	case 'K' : r = 10; break;
	case 'L' : r = 11; break;
	case 'M' : r = 12; break;
	case 'N' : r = 13; break;
	case 'O' : r = 14; break;
	case 'P' : r = 15; break;
	case 'Q' : r = 16; break;
	case 'R' : r = 17; break;
	case 'S' : r = 18; break;
	case 'T' : r = 19; break;
	case 'U' : r = 20; break;
	case 'V' : r = 21; break;
	case 'W' : r = 22; break;
	case 'X' : r = 23; break;
	case 'Y' : r = 24; break;
	case 'Z' : r = 25; break;
	}
	return r;
    }
}
