import java.util.*;

public class Main{
	
	public static String[] kommaReader(String sc) {
		String line = sc;
		String[] array = line.split(",");
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		long sum=0;
		long sumC=0;
		do{
			String t = sc.nextLine();
			String[] temp = kommaReader(t);
			sum += Long.parseLong(temp[0])*Long.parseLong(temp[1]);
			sumC+= Integer.parseInt(temp[1]);
			count++;
		} while(sc.hasNext());
		System.out.println(sum);
		System.out.println((int)sumC/count);
	}

}