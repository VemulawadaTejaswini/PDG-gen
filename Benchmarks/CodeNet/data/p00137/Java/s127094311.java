import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			int a = sc.nextInt();
			System.out.println("Case " + (i+1) +":");
			for(int k = 0 ; k < 10 ; k++){
				a = a * a;
				String buf = Integer.toString(a);
				if(buf.length() <= 8){
					for(int x = 0 ; x < 8 ; x++){
						buf = "0" + buf;
					}
				}
				buf = buf.substring(buf.length() -6,buf.length() -2);
				a = Integer.parseInt(buf);
				System.out.println(a);
			}
		}
		sc.close();
	}

}