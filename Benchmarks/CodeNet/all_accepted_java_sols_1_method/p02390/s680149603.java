

import java.util.Scanner;

class Main{
	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int time = times % 3600 / 60;
		System.out.println(times / 3600 + ":" + time + ":" +  times % 60);
	}
}

