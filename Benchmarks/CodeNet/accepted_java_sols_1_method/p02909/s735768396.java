import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] s = str.split(" ");
		String[] s_re = new String[s.length];
		for (int i=0;i<s.length;i++){
			switch(s[i]){
			case "Sunny":
				s_re[i] = "Cloudy";
				break;
			case "Cloudy":
				s_re[i] = "Rainy";
				break;
			case "Rainy":
				s_re[i] = "Sunny";
				break;
				default:
			}
		}
		for (int i=0;i<s.length;i++){
			System.out.print(s_re[i]+" ");
		}
	}
}	