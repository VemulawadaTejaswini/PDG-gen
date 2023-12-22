import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int ans1=0;
        int ans2=0;
        for(int j=0; j<n; j++){
            if(a[j]%2==0){
                ans1++;
                if((a[j]%3==0)||(a[j]%5==0)){
                    ans2++;
                }
            }
        }
        if(ans1==ans2){
            System.out.println("APPROVED");
        }
        else{
            System.out.println("DENIED");
        }
        sc.close();
    }
}