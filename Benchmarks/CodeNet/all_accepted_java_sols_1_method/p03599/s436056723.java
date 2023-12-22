import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next())*100;
		int B = Integer.parseInt(sc.next())*100;
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int E = Integer.parseInt(sc.next());
		int F = Integer.parseInt(sc.next());
		sc.close();

        int water = A, sugar = 0;
        for(int i = 0; i <= F / A; i++){
            for(int j = 0; j <= F / B; j++){
                for(int x = 0; x <= F / C; x++){
                    for(int y = 0; y <= F / D; y++){
                        int a = A * i + B * j;
                        int b = C * x + D * y;
                        if(100 * b <= a * E
                        		&& b * water > a * sugar
                        		&& a + b <= F){
                            water = a;
                            sugar = b;
                        }
                    }
                }
            }
        }
        System.out.println(water + sugar + " " + sugar);
	}
}