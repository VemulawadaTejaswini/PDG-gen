import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int count1=0;
		int count2=0;
		while(sc.hasNext()){
			String[] str=sc.next().split(",");
			count1++;
			count2+=Integer.parseInt(str[1]);
			sum+=(Integer.parseInt(str[0])*Integer.parseInt(str[1]));
		}
		int a=(count2*10)/count1-count2/count1*10;
		System.out.println(a>=5?sum+" "+(count2/count1+1):sum+" "+(count2/count1));
	}
}