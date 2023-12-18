import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] s = sc.nextLine().split("[\\s]+");
			int n = Integer.parseInt(s[0])+Integer.parseInt(s[1]);
			String ans = ""+n;
			System.out.println(ans.length());
		}
	}
}