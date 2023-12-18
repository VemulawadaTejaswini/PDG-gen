import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		while(true){
			int n =sc.nextInt();
			if(n==0){break;}
			int[] scores=new int[n];
			for(int i=0;i<scores.length;i++){
				scores[i]=sc.nextInt();
			}
			int max=0,ave=0;
			for(int i=0;i<scores.length;i++){
				if(max<scores[i]){
					max=scores[i];
				}
			}
			int min=scores[0];
			for(int i=1;i<scores.length;i++){
				if(min>scores[i]){
					min=scores[i];
				}
			}
			int sum=0,count=0;
			for(int i=0;i<scores.length;i++){
				if(scores[i]!=max && scores[i]!=min){
					sum=sum+scores[i];
					count++;
				}else if(scores[i]==max){
					max=max+1;
				}else{
					min=min-1;
				}
			}
			if(count!=0){
			ave=sum/count;
			}
			System.out.println(ave);
		}
	}
}