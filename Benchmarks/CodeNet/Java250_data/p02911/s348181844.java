import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int n=cin.nextInt();
        int k=cin.nextInt();
        int q=cin.nextInt();
        int num=k-q;

        int []an = new int[n];
        for(int i=0;i<n;i++)
            an[i]=num;


        while( q-->0 ){
            int t=cin.nextInt();
            an[--t]++;
        }
        for(int i=0;i<n;i++){
            if(an[i]>0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }


        cin.close();
    }

}
