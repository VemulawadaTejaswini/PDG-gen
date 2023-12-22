import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n >= 600) {
			if(n >= 800) {
				if(n >= 1000) {
					if(n >= 1200) {
						if(n >= 1400) {
							if(n >= 1600) {
								if(n >= 1800) {
									System.out.println("1");
								}else {
									System.out.println("2");
								}
							}else {
								System.out.println("3");
							}
						}else {
							System.out.println("4");
						}
					}else {
						System.out.println("5");
					}
				}else {
					System.out.println("6");
				}
			}else {
				System.out.println("7");
			}
		}else {
			System.out.println("8");
		}

	}

}
