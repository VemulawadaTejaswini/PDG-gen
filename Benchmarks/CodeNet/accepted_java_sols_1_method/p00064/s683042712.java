import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(scan.hasNext()){
			String[] str = scan.nextLine().split("[^0-9]+");
			for(int i = 0 ;i < str.length;i++){
				if(!str[i].equals(""))
				sum += Integer.parseInt(str[i]);
			}
		}
		scan.close();
		System.out.println(sum);
	}
}