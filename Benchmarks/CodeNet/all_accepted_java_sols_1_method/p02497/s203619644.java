import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		String minStr = null;
		try {
			while(br.ready()){
				buf = br.readLine();
				Scanner scanner = new Scanner(buf);
				int midExam = Integer.parseInt(scanner.next());
				int finExam = Integer.parseInt(scanner.next());
				int addExam = Integer.parseInt(scanner.next());
				if(midExam == -1 && finExam == -1 && addExam == -1){
					return;
				}
				if(midExam == -1 || finExam == -1){
					System.out.println("F");
					continue;
				}
				int sum = midExam + finExam;
				if(sum >= 80){
					System.out.println("A");
					continue;
				}
				if(sum >= 65){
					System.out.println("B");
					continue;
				}
				if(sum >= 50){
					System.out.println("C");
					continue;
				}
				if(sum >= 30){
					if(addExam >= 50){
						System.out.println("C");
						continue;
					}
					System.out.println("D");
					continue;
				}
				System.out.println("F");
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
}