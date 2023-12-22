import java.util.Scanner;
class Main {
	int m,f,r,x;
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		f = sc.nextInt();
		r = sc.nextInt();
		x = m + f;
		while(m != -1 || f != -1 || r != -1){
			if(m == -1 || f == -1){
				System.out.println("F");
			}else{
				if(x >= 80){
					System.out.println("A");
				}else if(x >= 65){
					System.out.println("B");
				}else if(x >= 50){
					System.out.println("C");
				}else if(x >= 30){
					if(r >= 50){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}else if(x < 30){
					System.out.println("F");
				}
			}
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			x = m + f;
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}