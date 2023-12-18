import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && m == 0) break;
			Data[] list = new Data[m];
			for(int i = 0; i < m; i++) {
				list[i] = new Data(i+1);
			}
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					list[j].num += stdIn.nextInt();
				}
			}
			Arrays.sort(list,new Comp());
			System.out.print(list[0].id);
			for(int i = 1; i < m; i++) {
				System.out.print(" " + list[i].id);
			}
			System.out.println();
			
		}
		
	}
}
class Comp implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		if(o1.num < o2.num) return 1;
		if(o1.num > o2.num) return -1;
		if(o1.id < o2.id) return -1;
		
		return 1;
	}
	
}
class Data {
	int id;
	int num;
	Data(int a) {
		id = a;
		num = 0;
	}
}