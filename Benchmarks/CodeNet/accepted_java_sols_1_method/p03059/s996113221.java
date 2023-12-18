import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] spl = s.split(" ");
		int A = Integer.parseInt(spl[0]);
		int B = Integer.parseInt(spl[1]);
		int T = Integer.parseInt(spl[2]);
		
		int bis = 0;
		
		for(int i = 1;i < T + 1;i++){
			if(A * i < T + 1){
				bis += B;
			}
		}
		System.out.println(bis);

	}

}