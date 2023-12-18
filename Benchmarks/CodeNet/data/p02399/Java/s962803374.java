import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a =scan.nextInt();
		int b =scan.nextInt();
        int d,r;
        double f;
        d=a/b;
        r=a%b;
        f=(double)a/(double)b;
        
       System.out.print(d + " ");
       System.out.print(r + " ");
       System.out.println(String.format("%.8f",f));
		
	
		
		
	}

}

