import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		String ret = ":(";

		if(b - a > k){
			System.out.println(ret);
		}else{
			if(c - a > k){
				System.out.println(ret);
			}else{
				if(d - a > k){
					System.out.println(ret);
				}else{
					if(e - a > k){
						System.out.println(ret);
					}else{
						if(c - b > k){
							System.out.println(ret);
						}else{
							if(d - b > k){
								System.out.println(ret);
							}else{
								if(e - b > k){
									System.out.println(ret);
								}else{
									if(d - c > k){
										System.out.println(ret);
									}else{
										if(e - c > k){
											System.out.println(ret);
										}else{
											if(e - d > k){
												System.out.println(ret);
											}else{
												System.out.println("Yay!");
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		sc.close();
	}
}
