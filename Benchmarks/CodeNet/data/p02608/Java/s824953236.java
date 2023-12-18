import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		for(int n=1;n<=N;n++) {
			label :for(int x=1;x<=100;x++) {
				for(int y=1;y<=100;y++) {
					for(int z=1;z<=100;z++) {
						if(x*x+y*y+z*z+x*y+y*z+z*x == n) {
							if(x==y&&y==z) {
								System.out.println(1);
							} else if(x!=y&&y!=z) {
								System.out.println(6);
							} else {
								System.out.println(3);
							}
							break label;
						}
						if(x==100&&y==100&&z==100) {
							System.out.println(0);
						}
					}
				}
			}
		}

	}
}