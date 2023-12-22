import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		String ret = "";
		for (int i=3; i<=n; i++){
			int j = i;
			if(i%3==0){
				ret += " " + i;
			}else{
			while(j>0){
				if(j%10==3){
					ret += " " + i;
					break;
				}else{
					j /= 10;
				}
			}}
		}
		System.out.println(ret);
	}
}