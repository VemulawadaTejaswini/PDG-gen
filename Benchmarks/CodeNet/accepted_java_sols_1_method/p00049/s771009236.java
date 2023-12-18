import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int[] count= new int[4];
		while(cin.hasNext()){
			String str = cin.next();
			String[] a = str.split(",");
			if(a[1].equals("A")){
				count[0]++;
			}
			else if(a[1].equals("B")){
				count[1]++;
			}
			else if(a[1].equals("AB")){
				count[2]++;
			}
			else{
				count[3]++;
			}
		}
		for(int i = 0; i < 4;i++){
			System.out.println(count[i]);
		}
	}

}