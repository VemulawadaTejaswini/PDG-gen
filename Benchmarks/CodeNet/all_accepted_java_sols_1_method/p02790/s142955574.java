import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String A = "";
		String B = "";
		for(int i=0;i<b;i++){
			A = A + String.valueOf(a);
		}
		for(int i=0;i<a;i++){
			B = B + String.valueOf(b);
		}
		if(A.compareTo(B)<=0){
			System.out.println(A);
		}else{
			System.out.println(B);
		}

	}
}
