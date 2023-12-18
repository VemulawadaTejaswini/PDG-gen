import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int m,f,r,point;
		while(true){
			point=0;
			m=scan.nextInt();
			f=scan.nextInt();
			r=scan.nextInt();
			if(m==-1&&f==-1&&r==-1) break;
			if(m==-1||f==-1){
				System.out.println("F");
			}else{
				point+=(m+f);
				if(80<=point){
					System.out.println("A");
				}else if(65<=point&&point<80){
					System.out.println("B");
				}else if(50<=point&&point<65){
					System.out.println("C");
				}else if(30<=point&&point<50){
					if(50<=r){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}else{
					System.out.println("F");
				}
			}
		}
		scan.close();
	}
}