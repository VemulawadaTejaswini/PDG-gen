import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String piyo = sc.next();
        char[] hoge = piyo.toCharArray();
		System.out.println(++hoge[0]);
	}
}