import java.util.Scanner;

public class Main {
	static final int replace = 1094496948;
	static final int reverse = 1099846370;
	static final int print = 106934957;
	void run(){
		Scanner s = new Scanner(System.in);
		String txt = s.next();
		int num = s.nextInt();
		for(int i = 0;i < num; i++){
			String pro = s.next();
			int sIndex = s.nextInt();
			int eIndex = s.nextInt();
			switch(pro.hashCode()){
				case replace:
					String rTxt = s.next();
					txt = replace(txt,sIndex,eIndex,rTxt);
					break;
				case reverse:
					txt = reverse(txt,sIndex,eIndex);
					break;
				case print:
					print(txt,sIndex,eIndex);
					break;

			}
		}
	}

	String replace(String txt,int sIndex,int eIndex,String rTxt){
		StringBuilder tmp = new StringBuilder(txt);
		tmp = tmp.replace(sIndex, eIndex+1, rTxt);
		return tmp.toString();
	}

	String reverse(String txt,int sIndex,int eIndex){
		StringBuilder tmp = new StringBuilder(txt.substring(sIndex,eIndex + 1));
		tmp = tmp.reverse();
		tmp = new StringBuilder(txt).replace(sIndex,eIndex + 1,tmp.toString());
		txt = tmp.toString();
		return txt;
	}

	void print(String txt,int sIndex,int eIndex){
		System.out.println(txt.substring(sIndex,eIndex + 1));
	}
	public static void main(String args[]){
		new Main().run();
	}
}