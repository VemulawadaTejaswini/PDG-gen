import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			String grade = "";
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			if(m == -1 && f == -1 && r== -1){
				scan.close();
				break;
			}else if(m == -1 || f == -1){
				grade = "F";
			}else if(80 <= m + f){
				grade = "A";
			}else if(65 <= m + f && m + f < 80){
				grade = "B";
			}else if(50 <= m + f && m + f < 65){
				grade = "C";
			}else if(30 <= m + f && m + f < 50){
				if(50 <= r){
					grade = "C";
				}else{
					grade = "D";
				}
			}else if(m + f < 30){
				grade = "F";
			}
			System.out.println(grade);
		}
	}
}