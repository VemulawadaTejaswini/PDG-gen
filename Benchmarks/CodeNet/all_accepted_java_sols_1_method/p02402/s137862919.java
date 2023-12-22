import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int d[] = new int [n];
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		Long sum = 0l;
		
		for(int i=0;i<n;i++){
			d[i]= sc.nextInt();
			if(d[i]>max){
				max = d[i];
			}
			if(d[i]<min){
				min = d[i];
			}
				sum+=d[i];
		}
		System.out.println(min+" "+max+" "+sum);
		sc.close();
	}

}

