import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		if(a.length()==1) {
			if(a.charAt(0)=='3') {
				System.out.println("bon");
			}else if(a.charAt(0)=='0'||a.charAt(0)=='1'||a.charAt(0)=='6'||a.charAt(0)=='8') {
				System.out.println("pon");
			}else {
				System.out.println("hon");
			}
		}else if(a.length()==2) {
			if(a.charAt(1)=='3') {
				System.out.println("bon");
			}else if(a.charAt(1)=='0'||a.charAt(1)=='1'||a.charAt(1)=='6'||a.charAt(1)=='8') {
				System.out.println("pon");
			}else {
				System.out.println("hon");
			}
		}else{
			if(a.charAt(2)=='3') {
				System.out.println("bon");
			}else if((a.charAt(2)=='0')||(a.charAt(2)=='1')||(a.charAt(2)=='6')||(a.charAt(2)=='8')) {
				System.out.println("pon");
			}else {
				System.out.println("hon");
			}
		}

	}
}