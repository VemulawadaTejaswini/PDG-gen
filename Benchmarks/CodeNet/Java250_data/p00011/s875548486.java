import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int i;
        int swap;

        int n=sc.nextInt();
        int[] numarr=new int[n];
        for(i=0;i<n;i++){
            numarr[i]=i+1;
        }
        int m=sc.nextInt();
        
        for(i=0;i<m;i++){
            String str=sc.next();
            String[] inte=str.split(",",0);
            int a=Integer.parseInt(inte[0])-1;
            int b=Integer.parseInt(inte[1])-1;
            swap=numarr[a];
            numarr[a]=numarr[b];
            numarr[b]=swap;
        }
        
        for(i=0;i<n;i++){
            System.out.println(numarr[i]);
        }
        sc.close();
    }
}
