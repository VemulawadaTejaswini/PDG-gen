import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		while(true){
			String num = sc.nextLine();
			if(num.equals("0"))break;
			int ans=0;
			for(int i=0;i<num.length();i++){
				ans+=Integer.parseInt(""+num.charAt(i));
			}
			System.out.println(ans);
		}
	}

}