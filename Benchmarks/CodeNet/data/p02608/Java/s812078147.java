import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for(int i = 1; i <= n; i++) {
			int count = 0;
			boolean flag = false;
			for(int x = 1; x <= Math.sqrt(n); x++) {
				for(int y = 1; y <= Math.sqrt(n);y++) {
					for(int z = 1; z <= Math.sqrt(n);z++) {
						if(i ==
							Math.pow(x, 2)+Math.pow(y, 2)+
							Math.pow(z, 2)+x*y+x*z+y*z) {
							if(x==y&&y==z) {
								System.out.println(1);
								flag = true;
								break;
							}
							else {
								System.out.println(3);
								flag = true;
								break;
							}
						}
					}
					if(flag) {
						break;
					}
				}
				if(flag) {
					break;
				}
			}
			System.out.println(count);
		}
	}
}