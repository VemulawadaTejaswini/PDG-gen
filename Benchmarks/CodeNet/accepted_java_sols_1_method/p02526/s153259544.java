import java.io.*;
import java.lang.*;
import java.util.Scanner;
//
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		byte states[] = new byte[10];
		int sLen, tLen;
		int i;
		HashSet<Integer> s = new HashSet<Integer>();
		HashSet<Integer> t = new HashSet<Integer>();
		//
		sLen = sc.nextInt();
		for(i = 0; i < sLen; i++){
			s.add(sc.nextInt());
		}
		tLen = sc.nextInt();
		for(i = 0; i < tLen; i++){
			t.add(sc.nextInt());
		}
		t.removeAll(s);
		System.out.println(tLen - t.size());
	}
}