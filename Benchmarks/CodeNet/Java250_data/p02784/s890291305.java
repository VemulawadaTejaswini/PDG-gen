import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
		for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=0; j<n; j++){
            sum+=a[j];
        }
        if(h-sum<=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}