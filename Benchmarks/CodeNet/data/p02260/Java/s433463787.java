import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i,j;
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        int intarr[]=new int[n];
        for(i=0;i<n;i++){
            intarr[i]=sc.nextInt(); 
        }
        int pivot=0;
        int times=0;
        int swap;

        for(i=0;i<n;i++){
            pivot=i;
            for(j=i;j<n;j++){
                if(intarr[j]<intarr[pivot]){
                    pivot=j;
                }
            }     
            if(i!=pivot){
                swap=intarr[i];
                intarr[i]=intarr[pivot];
                intarr[pivot]=swap;
                times++;  
            }                         
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
