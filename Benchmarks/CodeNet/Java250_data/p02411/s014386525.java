import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		while(true){
			int m = Integer.parseInt(std.next());
			int f = Integer.parseInt(std.next());
			int r = Integer.parseInt(std.next());
			String grade = "";
			if(m==-1 && f==-1 && r==-1){
				break;
			}else{
				if(m==-1 || f==-1){
					grade = "F";
				}else if(m+f>=80){
					grade = "A";
				}else if(m+f>=65){
					grade = "B";
				}else if(m+f>=50){
					grade = "C";
				}else if(m+f>=30){
					if(r>=50){
						grade = "C";
					}else{
						grade = "D";
					}
				}else {
					grade = "F";
				}
			}
			System.out.println(grade);
		}
	}
}