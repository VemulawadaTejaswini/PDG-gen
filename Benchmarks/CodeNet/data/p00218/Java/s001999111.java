import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			for(int i = 0 ; i < n ; i++){
				int pm = sc.nextInt();
				int pe = sc.nextInt();
				int pj = sc.nextInt();
				if(pm == 100 || pe == 100 || pj == 100){
					System.out.println("A");
				}else if(90 <= (pm+pe)/2){
					System.out.println("A");
				}else if(80 <= (pm+pe+pj)/3){
					System.out.println("A");
				}else if(70 <= (pm+pe+pj)/3){
					System.out.println("B");
				}else if(50 <= (pm+pe+pj)/3 && 80 <= pm || 80 <= pe){
					System.out.println("B");
				}else{
					System.out.println("C");
				}
			}
		}
		sc.close();
	}

}