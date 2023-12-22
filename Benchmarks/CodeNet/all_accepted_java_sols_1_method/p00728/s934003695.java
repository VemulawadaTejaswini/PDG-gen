import java.util.Scanner;

public class Main{
  public static void main(String[]args){
  	Scanner sc=new Scanner(System.in);
  	while(true){
  		int n=sc.nextInt();
  		int max=0,min=0,sum,score;
  		if(n==0){break;}

  		sum=0;
  		int s[]=new int[n];
  		for(int i=0;i<n;i++){
  			s[i]=sc.nextInt();
  			if(i==0){
  				max=s[i];
  				min=s[i];
  			}
  			if(s[i]<min) min=s[i];
  			if(s[i]>max) max=s[i];
  			sum+=s[i];
  		}
  		sum-=(max+min);
  		score=sum/(n-2);
  		System.out.println(score);
	}
  }
}