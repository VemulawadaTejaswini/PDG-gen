import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sum=n;
        int ans=0;


        for(int i=0; i<n; i++){
            sum=sum/k;
            ans++;
            if(sum<k){
                break;
            }
        }
        if(sum!=0){
            ans++;
        }
        sc.close();
        System.out.println(ans);
    }
}