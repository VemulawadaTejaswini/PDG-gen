//日本語を含むjavaプログラムのコンパイルは
//javac -encoding utf-8 Main.java
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    String[] r = new String[3];
    for (int i = 0; i < 3; i++) {
      r[i] = sc.next();
    }
    for (int i = 0; i < 3; i++) {
      System.out.print(r[i].charAt(i));
    }
	}
}