import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int[] ok = new int[31];
			for ( int i = 0; i < 28; i++)
				ok[sc.nextInt()]++;
			for ( int i = 1; i < ok.length; i++)
				if ( ok[i]==0 )System.out.println(i);
		}
	}
}