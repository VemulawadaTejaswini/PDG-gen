import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int score,max,min,sum=0;
			score=sc.nextInt();
			max=score;
			min=score;
			sum+=score;
			for(int i=1;i<n;i++){
				score=sc.nextInt();
				if(score>max){
					max=score;
				}
				else if(score<min){
					min=score;
				}
				sum+=score;
			}
			sum-=max+min;
			System.out.printf("%d\n",sum/(n-2));
		}
	}
}
