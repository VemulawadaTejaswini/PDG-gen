import java.util.Scanner;

public class Main{
  public static void main(String[]args){
  	Scanner sc=new Scanner(System.in);
  	while(true){
  		int n=sc.nextInt();
  		int r=sc.nextInt();
  		int card[]=new int[n];
  		int dummy[]=new int[n];

  		for(int i=0;i<n;i++){
  			card[i]=n-i;
  			dummy[i]=n-i;
  		}

  		for(int i=0;i<r;i++){
  			int p=sc.nextInt();
  			int c=sc.nextInt();

  			if(p==0&&c==0){break;}

  			for(int j=0;j<p+c-1;j++){
  				if(j<c){
  					card[j]=dummy[p+j-1];
  				}else{
  					card[j]=dummy[j-c];
  				}
  			}

  			for(int j=0;j<p+c-1;j++){
  				dummy[j]=card[j];
  			}
  		}
  		System.out.println(card[0]);
  	}
  }
}