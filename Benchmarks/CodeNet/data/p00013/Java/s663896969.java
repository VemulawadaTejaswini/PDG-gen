import java.util.ArrayList;
import java.util.Scanner;

class main {
	public static void main(String[] args){

		//?????°??£?¨?
		ArrayList<Integer> Shin = new ArrayList<Integer>();
		int i = 0;
		Integer hyouzi;

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()){
			int kari = sc.nextInt();



			if(kari == 0){
				i = i - 1;
				hyouzi = Shin.get(i);
				System.out.println(hyouzi);
				Shin.remove(i);		//??°????????\??£???????????±????¶????
			}else{
				Shin.add(kari);
				i = i + 1;
			}
		}
	}
}