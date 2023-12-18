import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=1,num;
		while(true){
			num=sc.nextInt();
			if(num!=0){
				System.out.printf("Case %d: %d\n",i++,num);
			}
			else{
				break;
			}
		}
	}
}
