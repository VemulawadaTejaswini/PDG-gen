import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] pa = a.split("");
		String b = sc.next();
		String[] pb = b.split("");
		if(pa.length == pb.length){
			for(int i=0;i<pa.length;i++){
				System.out.print(pa[i]+pb[i]);
			}
			System.out.println();
			return;
		}else if(pa.length > pb.length){
			for(int i=0;i<pa.length-1;i++){
				System.out.print(pa[i]+pb[i]);
			}
			System.out.println(pa[pa.length-1]);
		}
		
	}
}