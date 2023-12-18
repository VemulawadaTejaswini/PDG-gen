import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner kbd = new Scanner(System.in);
	
	while(kbd.hasNext()) {
	    int n = kbd.nextInt();
	    if(n == 1) break;
	    search(n);
	}
    }

    static void search(int n) { //月曜土曜素因数を捜索
	System.out.print(n + ":");
	int i=6;
	int a = 2;
	while(i<=n) {
	    if(n%i==0 && checkI(i)) System.out.print(" " + i);
	    i += a;
	    if(a==2) a=5;
	    else a=2;
	}
	System.out.println();
    }

    static boolean checkI(int s) { //割り切れた数は「月曜土曜素数」？
	int t = 6;  //最小の月曜土曜素数
	int a = 2;  //月曜／土曜シフト用
	while(t < s) {
	    if(s%t == 0) return false;
	    t += a;
	    if(a==2) a=5;
	    else a=2;
	}
	return true;
    }	
}