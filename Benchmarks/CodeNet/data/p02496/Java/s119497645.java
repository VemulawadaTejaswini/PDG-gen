//«èÈ¢J[hðoÍ·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean [][] cards = new boolean[4][14];
		for(int i=0; i < n; i++){
			String mark = sc.next();
			int num = sc.nextInt();
			if(mark.equals("S")){
				cards[0][num] = true;
			}
			else if(mark.equals("H")){
				cards[1][num] = true;
			}
			else if(mark.equals("C")){
				cards[2][num] = true;
			}
			else if(mark.equals("D")){
				cards[3][num] = true;
			}
			else{
				System.out.println(mark);
			}
		}
		for(int i=0; i < 4 ; i++){
			for(int j = 1; j < 14; j++){
				if(cards[i][j] != true){
					switch(i){
					case 0:
						System.out.println("S "+ j);
						break;
					case 1:
						System.out.println("H "+ j);
						break;
					case 2:
						System.out.println("C " + j);
						break;
					case 3:
						System.out.println("D "+ j );
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}

}