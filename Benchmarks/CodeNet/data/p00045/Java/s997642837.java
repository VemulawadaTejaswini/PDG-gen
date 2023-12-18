import java.util.*;

public class Main {
	
	public static String[] kommaReader(String sc) {
		String line = sc;
		String[] array = line.split(",");
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float count=0;
		long sum=0;
		long sumC=0;
		do{
			String t = sc.nextLine();
			if(t.equals("")) break;
			String[] temp = kommaReader(t);
			sum += Long.parseLong(temp[0])*Long.parseLong(temp[1]);
			sumC += Long.parseLong(temp[1]);
			count++;
		} while(sc.hasNextLine());
		System.out.println(sum);
		System.out.printf("%.0f",sumC/count);
	}

}