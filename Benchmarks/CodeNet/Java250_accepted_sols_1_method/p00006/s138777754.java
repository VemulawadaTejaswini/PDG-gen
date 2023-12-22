import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		char[] ds = d.toCharArray();
		StringBuffer res = new StringBuffer();
		
		for(int i = ds.length -1 ; i >=0; i--){
			res.append(ds[i]);
		}
		
		System.out.println(res.toString());
	}

}