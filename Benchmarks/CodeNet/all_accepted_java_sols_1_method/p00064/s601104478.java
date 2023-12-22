import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);
		int m=0;
		while(scan.hasNext()){
			String[] s = scan.next().split("[^0-9]+");
			for(String t: s){
				try{
				m+=Integer.parseInt(t);
				}
				catch(Exception e){
				}
			}
		}
		System.out.println(m);
	}

}