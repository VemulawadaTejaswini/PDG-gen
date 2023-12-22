//DayofTakahashi.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        
        int ans=0;
        for(int i=0; i<a; i++){
            ans++;
        }
        if(b<a){
            System.out.println(ans-1);
        }
        else{
            System.out.println(ans);
        }
        sc.close();
    }
}