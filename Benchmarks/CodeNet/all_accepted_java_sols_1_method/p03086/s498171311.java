import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String [] sArray = s.split("");
		int count = 0;
		int maxlen = 0;
		for(int i = 0; i < sArray.length; i++) {
			if(sArray[i].equals("A")||sArray[i].equals("C")||sArray[i].equals("G")||sArray[i].equals("T")) {
				count++;
				if(count >= maxlen) maxlen = count;
			}else count = 0;
		}
		System.out.println(maxlen);
		sc.close();
	}

}
