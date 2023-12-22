import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int xmax = -1000;
        int ymin = 1000;
        int com;
        
        for(int i = 0; i < N; i++){
            com = sc.nextInt();
            if(xmax < com){
                xmax = com;
            }
        }
        for(int i = 0; i < M; i++){
            com = sc.nextInt();
            if(ymin > com){
                ymin = com;
            }
        }
        
       if (ymin <= xmax) {
			System.out.println("War");
			return;
		}
		if (ymin <= X) {
			System.out.println("War");
			return;
		}
		if (xmax >= Y) {
			System.out.println("War");
			return;
		}
		
			System.out.println("No War");
	}
}
