import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int sum;
		Scanner sc = new Scanner(System.in);
		while(true){
			int c =sc.nextInt();
			int t =sc.nextInt();	
			int s =sc.nextInt();	

			if(c==-1&&t==-1&&s==-1){
				break;
			}

			if(c==-1||t==-1){
				System.out.printf("F");
			}

			sum =c+t;

			if(sum>=80&&c!=-1&&t!=-1){
				System.out.printf("A");
			}
			else if(sum>=65&&c!=-1&&t!=-1){
				System.out.printf("B");
			}
			else if(sum>=50&&c!=-1&&t!=-1){
				System.out.printf("C");
			}
			else if(sum>=30&&c!=-1&&t!=-1){
				if(s>=50){
					System.out.printf("C");		
				}
				else{
					System.out.printf("D");
				}
			}
			else if(c!=-1&&t!=-1){
				System.out.printf("F");
			}
			System.out.printf("\n");
		}
		
	}	
}