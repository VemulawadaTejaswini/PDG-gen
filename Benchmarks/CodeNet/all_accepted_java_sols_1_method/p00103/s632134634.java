import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int runner[]=new int[4];
		int n,out,i,score;
		String str;
		n=sc.nextInt();
		while(n--!=0){
			out=0;
			score=0;
			Arrays.fill(runner,0);
			while(true){
				if(3<=out) break;
				str=sc.next();
				if(str.equals("HIT")){
					for(i=2;0<=i;i--){
						runner[i+1]=runner[i];
					}
					runner[0]=1;
					score+=runner[3];
				}
				if(str.equals("HOMERUN")){
					for(i=0;i<3;i++){
						score+=runner[i];
					}
					score++;
					Arrays.fill(runner,0);
				}
				if(str.equals("OUT")){
					out++;
				}
			}
			System.out.println(score);
		}
	}
}