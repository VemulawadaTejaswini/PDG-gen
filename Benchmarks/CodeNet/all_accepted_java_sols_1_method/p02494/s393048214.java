import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
	int H = sc.nextInt();
	int W= sc.nextInt();
	if (H == 0 && W == 0) {
	break;
	}

	for(int n=1;n<=H;n++){

	for(int i=1;i<=W;i++){
		if(i==W){
			System.out.printf("#\n");
		}
		else{System.out.printf("#");
	}
	}
}
System.out.printf("\n");
}}}