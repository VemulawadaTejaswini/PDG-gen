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
									System.out.println("1級");
								}else {
									System.out.println("2級");
								}
							}else {
								System.out.println("3級");
							}
						}else {
							System.out.println("4級");
						}
					}else {
						System.out.println("5級");
					}
				}else {
					System.out.println("6級");
				}
			}else {
				System.out.println("7級");
			}
		}else {
			System.out.println("8級");
		}

	}

}
