import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int d[] = new int [n];
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,sum=0;
		
		for(int i=0;i<n;i++){
			d[i]= sc.nextInt();
			if(d[i]>max){
				max = d[i];
				sum += d[i];
			}
			else if(d[i]<min){
				min = d[i];
				sum +=d[i];
			}
			else{
				sum+=d[i];
			}
		}
		System.out.println(min+" "+max+" "+sum);
	}

}

