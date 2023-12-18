import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(sc.hasNext()){
			String str = (sc.nextLine()).replace("Hoshino", "Hoshina");
			System.out.println(str);
		}
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}