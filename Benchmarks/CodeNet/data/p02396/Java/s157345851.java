import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,x;
		Scanner sc = new Scanner(System.in);
		for(i=0;;i++){
			x = sc.nextInt();
			if(x==0){
				sc.close();
				return;
			}
			System.out.println("case "+(i+1)+": "+x);
		}
	}

}
