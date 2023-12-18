import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i;
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int intarr[]=new int[n];
        for(i=0;i<n;i++){
            intarr[i]=sc.nextInt(); 
        }

        for(i=0;i<n;i++){
            System.out.printf("%d",intarr[n-1-i]);
            if(i!=n-1){
                System.out.printf(" ");
            }           
        }
        System.out.println();
        sc.close();
    }    
}
