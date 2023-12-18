import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==-1&&b==-1&&c==-1) break;
			if(a==-1||b==-1){
				System.out.println("F");
				continue;
			}else if(a+b>=50){
				if(a+b>=65){
					if(a+b>=80){
						System.out.println("A");
						continue;
					}else{
						System.out.println("B");
						continue;
					}
				}else{
					System.out.println("C");
					continue;
				}
			}else{
				if(a+b<30){
					System.out.println("F");
					continue;
				}else if(c>=50){
					System.out.println("C");
					continue;
				}else{
					System.out.println("D");
					continue;
				}
			}
		}
	}
}