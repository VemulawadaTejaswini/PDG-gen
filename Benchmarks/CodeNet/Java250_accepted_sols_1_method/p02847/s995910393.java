import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String f = sc.nextLine();
		if(f.equals("SUN")){
			System.out.println(7);
		}
		if(f.equals("MON")){
			System.out.println(6);
		}
		if(f.equals("TUE")){
			System.out.println(5);
		}
		if(f.equals("WED")){
			System.out.println(4);
		}
		if(f.equals("THU")){
			System.out.println(3);
		}
		if(f.equals("FRI")){
			System.out.println(2);
		}
		if(f.equals("SAT")){
			System.out.println(1);
		}
	}
}