import java.util.Scanner;
class Main{
    public static void main(String[] args){
		int n,a;
		int min=1000000;
		int max=-1000000;
		long total=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			a=sc.nextInt();
			if(min>=a)min=a;
			if(max<=a)max=a;
			total+=a;
		}
		System.out.println(min+" "+max+" "+total);
    }
}

