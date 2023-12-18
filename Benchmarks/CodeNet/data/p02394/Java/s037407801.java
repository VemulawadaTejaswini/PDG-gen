import java.util.Scanner;

class Main{

	public static void main(String[] args) {

	int[] n = new int[5];
	int W,H,x,y,r;

	Scanner scan = new Scanner(System.in);

	for(int i=0; i<5; i++) n[i] = scan.nextInt();
	
	W = n[0];
	H = n[1];
	x = n[2];
	y = n[3];
	r = n[4];
	
	if( (r<=x && x<=W-r) && (r<=y && y<=H-r) ) System.out.println("Yes");
	else System.out.println("No");
	
	scan.close();
	}
}