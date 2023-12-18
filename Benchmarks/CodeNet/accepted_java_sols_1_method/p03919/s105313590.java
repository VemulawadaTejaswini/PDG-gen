import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String s1 = "snuke";
		sc.nextLine();
		boolean b=false;
		int i=0;
		int j = 0;
		String[][] s = new String[H][W];
		for (i=0;i<H;i++){
			for (j=0;j<W;j++){
				s[i][j] = sc.next();
			}
			sc.nextLine();
		}
		for (i=0;i<H;i++){
			for (j=0;j<W;j++){
				if (s1.equals(s[i][j])){
					b=true;
					break;
				}
			}
			if(b==true){
				break;
			}
		}
		System.out.println((char)(j+1+64)+String.valueOf(i+1));
	}

}