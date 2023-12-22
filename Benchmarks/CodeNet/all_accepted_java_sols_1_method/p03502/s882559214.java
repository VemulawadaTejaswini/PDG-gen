import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int sum = 0;
		for(int i=0; i<n.length(); i++){
			sum += Integer.parseInt(n.substring(i,i+1));
		}
		System.out.println(Integer.parseInt(n)%sum == 0 ? "Yes" : "No");
	}
}
