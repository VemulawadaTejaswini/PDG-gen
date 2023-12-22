import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		int [] haiku = {a,b,c};
		int temp = 0;
		
		for(int i = 0; i<3 ; i++ ) {
			for(int j=0 ; j<3 ; j++) {
				if(haiku[i]<haiku[j]) {
					temp=haiku[i];
					haiku[i]=haiku[j];
					haiku[j]=temp;
				}
			}
		}
		if(haiku[0]==5 && haiku[1]==5 && haiku[2]==7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();


	}

}
