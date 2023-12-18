import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.nextLine();  //個数nを入力

		String v = scan.nextLine();  //入力列
		String[] a = v.split(" "); //" "で区切って配列にする
		int count = 0;
		int[] number = new int[n]; //数字の配列を作る
		
		for(int i = 0; i < n; i++){ //入力列の配列を先ほど作った数字の配列に代入
			number[i] = Integer.parseInt(a[i]);
			//System.out.print(number[i] + " ");
		}
		
		boolean assess = true;
		while(assess){
			for(int i = 0; i < n; i++){
				if((number[i]) % 2 == 0){
					number[i] = number[i] / 2;
					count++;
				}else{
					assess = false;
					break;
				}
			}
		}
		System.out.println(count/n);	
	}
}