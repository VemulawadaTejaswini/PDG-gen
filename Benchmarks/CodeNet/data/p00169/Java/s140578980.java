import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.equals("0")){
				break;
			}
			String[] ns = str.split(" ");
			int sum = 0;
			int count = 0;
			for(int i = 0;i < ns.length;i++){
				int t = Integer.parseInt(ns[i]);
				sum += (t > 9)?10:t;
				if(t == 1){
					count++;
				}
			}
			boolean fl = true;
			if(sum > 21){
				System.out.println("0");
				fl = false;
			}else if(count > 0){
				for(int i = 0;i < count;i++){
					sum += 10;
					if(sum > 21){
						System.out.println(sum-10);
						fl = false;
						break;
					}
				}
			}
			if(fl){
				System.out.println(sum);
			}
		}
	}
}