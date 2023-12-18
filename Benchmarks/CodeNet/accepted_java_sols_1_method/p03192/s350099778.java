import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int count = 0;
		for(char v : a.toCharArray()){
			if( v == '2'){
				count++;
			}
		}
		System.out.println(count);
	}
}