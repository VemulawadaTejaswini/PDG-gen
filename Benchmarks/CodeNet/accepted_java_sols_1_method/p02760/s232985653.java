//Bingo.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int c[]=new int[3];
        int d[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            c[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            d[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }

		for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    a[i]=-1;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                if(c[i]==b[j]){
                    c[i]=-1;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                if(d[i]==b[j]){
                    d[i]=-1;
                }
            }
        }
        if((a[0]==-1&&a[1]==-1&&a[2]==-1)||(c[0]==-1&&c[1]==-1&&c[2]==-1)||(d[0]==-1&&d[1]==-1&&d[2]==-1)||
         (a[0]==-1&&c[0]==-1&&d[0]==-1)||(a[1]==-1&&c[1]==-1&&d[1]==-1)||(a[2]==-1&&c[2]==-1&&d[2]==-1)||
         (a[0]==-1&&c[1]==-1&&d[2]==-1)||(a[2]==-1&&c[1]==-1&&d[0]==-1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}