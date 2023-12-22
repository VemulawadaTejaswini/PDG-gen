import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<String> grade=new ArrayList<>();
		int a,b,c;
		while(true) {
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			if(a==-1 && b==-1 && c==-1) {
				break;
			}
			if(a==-1 || b==-1) {
				grade.add("F");
			}else if(a+b>=80) {
				grade.add("A");
			}else if(a+b<80 && a+b>=65) {
				grade.add("B");
			}else if(a+b<65 && a+b>=50) {
				grade.add("C");
			}else if(a+b<=50 && a+b>=30) {
				if(c>=50) {
					grade.add("C");
				}else {
					grade.add("D");
				}
			}else if(a+b < 30){ 
				grade.add("F");
			}
		}
		
		for(int i=0;i<grade.size();i++) {
			System.out.println(grade.get(i));
		}

	}

}