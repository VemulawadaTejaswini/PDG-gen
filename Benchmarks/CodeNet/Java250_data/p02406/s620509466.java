import java.util.Scanner;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder bu = new StringBuilder();
		int h=sc.nextInt();
			for(int i=1;i<=h;i++){
				int x=i;
					if(x%3==0){
						bu.append(" ").append(i);
					}else{
						while(x!=0){
							if(x%10==3){
								bu.append(" ").append(i);
								break;
							}else{
								x/=10;
							}
						}
					}
			}
		System.out.println(bu);
	}
}