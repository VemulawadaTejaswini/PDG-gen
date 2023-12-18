//CatsandDogs.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();

        if(a>x||a+b<x){
            System.out.println("NO");
        }
        else{
            if(x-a<=b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}	