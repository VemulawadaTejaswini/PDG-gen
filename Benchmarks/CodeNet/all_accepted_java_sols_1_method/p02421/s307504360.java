import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.nextLine());
		int taro = 0;
		int hana = 0;

		for(int i=0; i<n; i++){
			String taroline = std.next();
			String hanaline = std.next();
			if(taroline.compareTo(hanaline)<0){hana+=3;}
			else if(taroline.compareTo(hanaline)==0){hana++; taro++;}
			else if(taroline.compareTo(hanaline)>0){taro+=3;}
		}
		System.out.println(taro+" "+hana);
	}
}