import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner scan = new Scanner(System.in);
	int X = scan.nextInt();
    int sum =0;
    int d =0;
    int l =0;
    int g =0;
    for(int i=0;i<=X;i++){
    	sum += i;
		if(X<=sum){
			d = i;
		break;
		}
    }
    System.out.println(d);
}
}