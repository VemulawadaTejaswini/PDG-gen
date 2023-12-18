import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args){

		//?????°??£?¨?
		ArrayList<String> Shin = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()){
			String kari = sc.next();

			if(kari.equals("0")){
				String hyouzi = Shin.get(Shin.size()-1);
				System.out.println(hyouzi);
				Shin.remove(Shin.size()-1);		//??°????????\??£???????????±????¶????
			}else{
				Shin.add(kari);
			}
		}
	}
}