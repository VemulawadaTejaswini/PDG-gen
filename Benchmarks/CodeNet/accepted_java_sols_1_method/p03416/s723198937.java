import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] info = new Scanner(System.in).nextLine().split(" ");
		Integer min=Integer.valueOf(info[0]);
		Integer max=Integer.valueOf(info[1]);
		int count=0;
		for(Integer i=min;i<=max;i++) {
			char[] numlist=i.toString().toCharArray();
			if(numlist[0]==numlist[4]&&numlist[1]==numlist[3])
				count++;
		}
		System.out.println(count);
	}
}