import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int i;
        int count=0;
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int intarr[]=new int[n];
        for(i=0;i<n;i++){
            intarr[i]=sc.nextInt(); 
        }
        int qlong=sc.nextInt();
        int qintarr[]=new int[qlong];
        for(i=0;i<qlong;i++){
            qintarr[i]=sc.nextInt();
        }
       
        for(i=0;i<qlong;i++){
            int pivot[]={-1,n/2,n};
            while(true){
                if(intarr[pivot[1]]==qintarr[i]){
                    count++;
                    break;
                }else if(intarr[pivot[1]]>qintarr[i]){
                    if(pivot[1]-pivot[0]<=1){
                        break;
                    }
                    pivot[2]=pivot[1];
                    pivot[1]=(pivot[0]+pivot[1])/2;
                }else{
                    if(pivot[2]-pivot[1]<=1){
                        break;
                    }
                    pivot[0]=pivot[1];
                    pivot[1]=(pivot[1]+pivot[2])/2;
                }
            }         
        }
        System.out.println(count);
    }
}
