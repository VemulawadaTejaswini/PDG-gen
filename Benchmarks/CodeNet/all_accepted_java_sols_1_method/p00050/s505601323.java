import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println(((sc.nextLine()).replaceAll("peach", "sasami").replaceAll("apple", "samy").replaceAll("samy", "peach").replaceAll("sasami", "apple")));
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}