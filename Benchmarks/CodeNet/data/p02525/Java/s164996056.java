import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			int n=s.nextInt();
			if(n==0)break;
			double a[]=new double[n];
			double sum=0;
			for(int i=0;i<n;i++){
				a[i]=s.nextDouble();
				sum+=a[i];
			}
      double ave=sum/n;
      double bs=0;
      for(int i=0;i<n;i++)bs+= Math.pow((a[i]-ave),2);
      System.out.println(Math.sqrt(bs/n));
    }
  }
}