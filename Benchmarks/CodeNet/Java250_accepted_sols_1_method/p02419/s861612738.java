import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		int i = 0;

		while(sc.hasNext()){
			String str = sc.next();

			if(str.equals("END_OF_TEXT")){
				break;
			}else if(str.equalsIgnoreCase(W)){
				i++;
			}
			}
		System.out.println(i);
	}
}

