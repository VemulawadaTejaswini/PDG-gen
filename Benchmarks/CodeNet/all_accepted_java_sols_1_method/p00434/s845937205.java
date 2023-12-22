import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
        boolean[] X = new boolean[30];
		for(int i = 0; i < 28; i++){
			X[n.nextInt()-1] = true;
		}
		
		for(int i = 0; i < 30; i++){
			if(!X[i]){
				System.out.println(i+1);
			}
		}

	}

}
