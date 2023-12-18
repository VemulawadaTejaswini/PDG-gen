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
        int pivot=n;
        int times=0;
        int swap;

        while(pivot>0){
            for(i=0;i<pivot-1;i++){
                if(intarr[i]>intarr[i+1]){
                    swap=intarr[i];
                    intarr[i]=intarr[i+1];
                    intarr[i+1]=swap;
                    times++;
                }                
            }
            pivot--;
        }

        for(i=0;i<n;i++){
            if(i==n-1){
                System.out.printf("%d",intarr[i]);
            }else{
                System.out.printf("%d ",intarr[i]);
            }
            
        }
        System.out.printf("%n");
        System.out.println(times);
    }    
}
