import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc= new Scanner (System.in);
		int n=Integer.parseInt(sc.nextLine());
		int num;
		int ori=2000000001;
		int answer=-2000000000;
		for(int i=0;i<n;i++){
			num = Integer.parseInt(sc.nextLine());
			if(i>0 && answer<num-ori){
				answer=num-ori;
			}
			if(ori>num){
				ori=num;
			}
		}
		System.out.println(answer);
	}
}
