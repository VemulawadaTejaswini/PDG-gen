//Exchange.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int suma=sc.nextInt();
        int sumb=sc.nextInt();
        int k=sc.nextInt();

        for(int i=1; i<=k; i++){
            if(i%2==0){
                if(sumb%2==0){
                    suma+=sumb/2;
                    sumb=sumb-(sumb/2);
                }
                else{
                    sumb=sumb-1;
                    suma+=sumb/2;
                    sumb=sumb-(sumb/2);
                }
            }
            else{
                if(suma%2==0){
                    sumb+=suma/2;
                    suma=suma-(suma/2);
                }
                else{
                    suma=suma-1;
                    sumb+=suma/2;
                    suma=suma-(suma/2);
                }
            }
        }
        sc.close();
        System.out.println(suma+" "+sumb);
    }
}