import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] list = s.split("");
		int b1=0,w1=0,b2=0,w2=0;
		for(int i = 0; i < list.length; i++) {
			if(i%2 != 0) {
				if(list[i].equals("0")) {
					b1++;
				}else{
					w1++;
				}
			}else {
				if(list[i].equals("0")) {
					b2++;
				}else {
					w2++;
				}
			}
		}

		if((Math.abs(list.length-b1-w2))>Math.abs(list.length-b2-w1)) {
			System.out.println(Math.abs(list.length-b2-w1));
		}else {
			System.out.println(Math.abs(list.length-b1-w2));
		}
	}
}