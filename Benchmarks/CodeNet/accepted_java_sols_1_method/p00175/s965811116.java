import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==-1){
				break;
			}
			String str = Integer.toBinaryString(N);
			if(str.length()%2!=0){
				str= "0"+str;
			}
			String ans = "";
			for(int i = 0;i<str.length();i+=2){
				int value = Integer.parseInt(str.substring(i,i+2));
				if(value==0){
					ans= ans+"0";
				}
				else if(value==1){
					ans= ans+"1";
				}
				else if(value==10){
					ans= ans+"2";
				}
				else if(value==11){
					ans= ans+"3";
				}
			}
			System.out.println(ans);
		}

	}

}