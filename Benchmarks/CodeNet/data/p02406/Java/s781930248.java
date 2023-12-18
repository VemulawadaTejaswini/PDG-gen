import java.util.Scanner;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder bu = new StringBuilder();
		int h=sc.nextInt();
			for(int i=1;i<=h;i++){
					if(i%3==0){
						bu.append(" "+i);
					}else if(i%10==0){
						bu.append(" "+i);
					}
			}
		bu.append("\n");
		System.out.print(bu);
	}
}