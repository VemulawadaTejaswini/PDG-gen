import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        int result=0;
        
        if(a>b){
            for(int i=0; i<a; i++){
                System.out.print(b);
            }
        }
        if(a<b){
            for(int i=0; i<b; i++){
                System.out.print(a);
            }
        }
        if(a==b){
            for(int i=0; i<b; i++){
                System.out.print(a);
            }
        }
    }
}