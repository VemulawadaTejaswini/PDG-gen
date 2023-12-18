import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt(),hou,sum;
			if(n==0)break;
			for(int i=0;i<n;i++){
				int s=sc.nextInt();
				hou+=s*s;
				sum+=s;
			}
			Double kin=sum/n;
			Double a=Math.sqrt((hou/n)-kin*kin);
			System.out.println(a);
		}
	}

}