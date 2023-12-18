import java.util.Scanner;

public class Main {

	static Scanner sc = new java.util.Scanner(System.in);

	static int count =0;

	public static void main(String[] args) {

		while (sc.hasNext()) {
			String str =sc.next();
			String[] st = str.split("");

			for(int i=0;i>(st.length/2);i++){
				if(st[i].equals(st[st.length-i-1])){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}