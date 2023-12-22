import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lm=4280;
		int m=0;
		while(true){
			int w=sc.nextInt();
			if(w==-1)break;
			if(w<=10)m=1150;
			else if(w<=20)m=1150+125*(w-10);
			else if(w<=30)m=1150+125*10+140*(w-20);
			else m=1150+125*10+140*10+160*(w-30);
			System.out.println(lm-m);
		}
	}
}