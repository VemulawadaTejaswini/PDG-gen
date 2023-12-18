import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

for(;;){

	int m = sc.nextInt();

	int f = sc.nextInt();

	int r = sc.nextInt();

	int t = m+f;
if(m==-1 && f==-1 && r==-1) break;

		if (m==-1 || f==-1) { System.out.println("F");
	}
		else if(t >= 65){
			if(t >= 80){
				System.out.println("A");
			}else{
				System.out.println("B");
			}
		}else if(t>=50){
			System.out.println("C");
		}else if(t>=30){
			if(r>=50){
				System.out.println("C");
			}else{
				System.out.println("D");
			}

		}else{
			System.out.println("F");
		}

		}
	}