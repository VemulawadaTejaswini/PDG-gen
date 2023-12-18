import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		double count1=0;
		double count2=0;
		while(count1<3){
			String[] str=sc.next().split(",");
			count1++;
			count2+=Integer.parseInt(str[1]);
			sum+=(Integer.parseInt(str[0])*Integer.parseInt(str[1]));
		}
		System.out.println(sum+" "+Math.round(count2/count1));
	}
}