import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cou = 0;
			int ab = a+b;
			while(ab != 0){
				ab /= 10;
				cou++;
			}
			System.out.println(cou);
		}
	}
}

