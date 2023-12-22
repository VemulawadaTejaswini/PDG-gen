import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int[] first = new int[10];
			char[] ch = scan.nextLine().toCharArray();
			for(int i = 0;i < 10;i++){
				first[i] = Integer.parseInt(ch[i] + "");
			}
			int n = 9;
			while(n > 0){
				for(int i = 0;i < n;i++){
					first[i] = (first[i] + first[i+1])%10;
				}
				n--;
			}
			System.out.println(first[0]);
		}
	}
}