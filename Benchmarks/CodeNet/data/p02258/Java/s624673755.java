import java.util.*;

public class Main{
	public static void main(String[] args){
		
		Scanner sc= new Scanner (System.in);
		int n=Integer.parseInt(sc.nextLine());
		int num;
		int ori=200001;
		int big=1;
		int answer=big-ori-1;
		for(int i=0;i<n;i++){
			num = Integer.parseInt(sc.nextLine());
			if(ori>num){
				ori=num;
			}
			if(i>0 && answer<num-ori){
				answer=num-ori;
			}
		}
		System.out.println(answer);
	}
}
