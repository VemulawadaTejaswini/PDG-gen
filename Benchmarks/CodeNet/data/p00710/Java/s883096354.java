import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n=sc.nextInt();//输入字符串（个数）
			int []card=new int[n];
			int j=n;
			for(int i=0;i<n;i++) {
				card[i]=j;
				j--;
			}//读取数组
			StringBuffer card1 = new StringBuffer();
			for(int i=0;i<card.length;i++){
			   card1.append(card[i]);
			}
			String cards = card1.toString();//数组转化字符串
			int m = sc.nextInt();//输入执行回数
for(int i=0;i<m;i++) {//开始循环
	int count=sc.nextInt();
	int count1=count-1;//输入顶牌交换的地方
	int count2=sc.nextInt();//输入下层交换的地方
	if(count==0&&count2==0) {
		break;
	}
	String move=cards.substring(0,count1);
	String move2=cards.substring(count1,count1+count2);
	String move3=cards.substring(count1+count2);
	//String move3=cards.substring(count2);
	cards=move2+move+move3;
}
System.out.println(cards.charAt(0));
		}
	}
}
