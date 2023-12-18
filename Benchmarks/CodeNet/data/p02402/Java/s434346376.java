import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String nn=scan.nextLine();
		int n=Integer.parseInt(nn);
		String val=scan.nextLine();
		String [] numnum=val.split(" ",0);
		int [] num=new int [n];
		for(int i=0;i<n;i++){
			num[i]=Integer.parseInt(numnum[i]);
		}
		int max=-10000000;
		int min=10000000;
		long count=0;
		for(int i=0;i<n;i++){
			if(num[i]>max){
				max=num[i];
			}
			if(num[i]<min){
				min=num[i];
			}
			count+=num[i];
		}
		System.out.println(min+" "+max+" "+count);
	}
}
	