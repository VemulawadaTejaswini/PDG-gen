import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner SC = new Scanner(System.in);
int N = SC.nextInt();
int H [] = new int[N + 1];
for(int i = 1; i <= N; i++) {
    H[i] = SC.nextInt();
}
int counter = 0;
for(int i = 1; i <= N; i++) {
	boolean cso = true;
	for(int j = 1; j < i; j++) {
		if(H[j] > H[i]) {
			cso = false;
		}
	}
	if(cso) {
		counter++;
	}
}
System.out.println(counter);
	}

}
