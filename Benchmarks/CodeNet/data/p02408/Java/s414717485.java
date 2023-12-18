import java.util.Scanner;
class Main {
	int n,i,y;
	String x;
	private int[] S = new int[14];
	private int[] H = new int[14];
	private int[] C = new int[14];
	private int[] D = new int[14];
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 0;i != n;i++){
			x = sc.next();
			if(x.equals("S")){
				y = sc.nextInt();
				S[y] = y;
			}else if(x.equals("H")){
				y = sc.nextInt();
				H[y] = y;
			}else if(x.equals("C")){
				y = sc.nextInt();
				C[y] = y;
			}else if(x.equals("D")){
				y = sc.nextInt();
				D[y] = y;
			}
		}
		for(i = 1;i <= 13;i++){
			if(S[i]  == 0){
				System.out.println("S" + " " + (i));
			}
		}
		for(i = 1;i <= 13;i++){
			if(H[i] == 0){
				System.out.println("H" + " " + (i));
			}
		}
		for(i = 1;i <= 13;i++){
			if(C[i] == 0){
				System.out.println("C" + " " + (i));
			}
		}
		for(i = 1;i <= 13;i++){
			if(D[i] == 0){
				System.out.println("D" + " " + (i));
			}
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}