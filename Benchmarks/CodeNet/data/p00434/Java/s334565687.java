import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int[] attendanceNumbers = new int[28];
			for(int i=0;i<28;i++)attendanceNumbers[i] = stdIn.nextInt();
			Arrays.sort(attendanceNumbers);
			ArrayList<Integer> array = new ArrayList<Integer>();
			for(int i=1;i<=30;i++)array.add(i);
			for(int i:attendanceNumbers)array.remove(i);
			for(int i:attendanceNumbers)System.out.println(i);
		}
	}
}