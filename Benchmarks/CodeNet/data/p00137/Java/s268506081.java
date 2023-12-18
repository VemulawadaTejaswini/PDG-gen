import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int j = 0 ; j < n ; j++){
			System.out.println("Case " + (j+1) +":");
			for(int k = 0 ; k < 10 ; k++){
				a[j] = a[j] * a[j] ;
				String buf = Integer.toString(a[j]);
				if(buf.length() <= 8){
					for(int x = 0 ; x < 8 - buf.length() ; x++){
						buf = "0" + buf;
					}
				}
				buf = buf.substring(buf.length() -6,buf.length() -2);
				a[j] = Integer.parseInt(buf);
				System.out.println(a[j]);
			}
		}
		sc.close();
	}

}