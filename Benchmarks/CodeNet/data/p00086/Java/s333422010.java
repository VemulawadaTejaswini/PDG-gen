import java.util.Scanner;
import static java.lang.Math.*;

import java.io.PrintWriter;
class Main{
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		int temp [] = new int[1001];
		while(sc.hasNext()){
			while(true){
				int in1 = sc.nextInt(),
						in2 = sc.nextInt();
				if(in1 == 0 || in2 == 0)break;
				temp[in1]++;
				temp[in2]++;
			}
			int count = 0;
			for(int i:temp){
				if(i % 2 == 1)count++;
			}
			if(count != 2)out.println("NG");
			else if(temp[1]%2==1 && temp[2]%2==1)out.println("OK");
			else out.println("NG");
			out.flush();
		}
	}
} 