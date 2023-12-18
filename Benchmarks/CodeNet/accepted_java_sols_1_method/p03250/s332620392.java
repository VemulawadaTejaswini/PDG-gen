import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int x=0;
        int n[]=new int[3];
        for(int i=0; i<3; i++){
            n[i]=sc.nextInt();
        }
        for(int i=1; i>=0; i--){
            if(n[i]<n[i+1]){
                x=n[i+1];
                n[i+1]=n[i];
                n[i]=x;
            }
        }
        System.out.println(n[0]*10+n[1]+n[2]);
        sc.close();
    }
}