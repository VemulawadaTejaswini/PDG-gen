import java.util.Scanner;

public class Main {
	void run(){
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int y = s.nextInt();
      int p = s.nextInt();
       int max = 0;
       for(int i = 1; i < p; i++) {
         for (int j = 1; j < p; j++){
            int checkNum = i * (100 + x) / 100 + j * (100 + x) / 100;
            if( checkNum ==  p){
                int onceNum = (int)((double)(i * (100 + y) / 100) + (double)(j * (100 + y) / 100));
                max = Math.max(max, onceNum);
            }
         }
       }
       System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}