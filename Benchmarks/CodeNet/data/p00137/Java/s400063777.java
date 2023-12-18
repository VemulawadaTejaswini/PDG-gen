import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			for(int i = 0;i < n;i++){
				System.out.println("Case " + (i+1) + ":");
				int s = scan.nextInt();
				String ts = "";
				for(int j = 0;j < 10;j++){
					s *= s;
					ts = String.valueOf(s);
					if(ts.length() < 8){
						ts = addZero(ts);
					}
					ts = ts.substring(2,6);
					s = Integer.parseInt(ts);
					System.out.println(s);
				}
			}
		}
	}
	
	public static String addZero(String str){
		String t = "";
		for(int i = 0;i < 8-str.length();i++){
			t += "0";
		}
		return t+str;
	}
}