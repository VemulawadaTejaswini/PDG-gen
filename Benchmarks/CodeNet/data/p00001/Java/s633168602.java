import java.util.Scanner;


class Main{
    public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int numone = 0;
		int nomtwo = 0;
		int numthree = 0;
		int x;
		for (i=0; i<9; i++) {
			x = sc.netInt();
			if (numone < x) {
				numthree = numtwo;
				numtwo = numone;
				numone = x;
			} else if (numtwo < x) {
				numthree = numtwo;
				numtwo = x;
			}else if (numthree < x) {
				numthree = x;
			}
		}
		System.out.println(numone + "\n" + numtwo + "\n" + numthree);
	}
}