import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String buff="";
		int buff2,res=0;

		for(int i=0;i<=s.length()-3;i++) {
			buff=s.substring(i, i+3);
			buff2=Integer.parseInt(buff);
			//System.out.println(res);
			if(Math.abs(res-753)>Math.abs(buff2-753)) {
				res=buff2;
			}
		}

		System.out.println(Math.abs(res-753));
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


