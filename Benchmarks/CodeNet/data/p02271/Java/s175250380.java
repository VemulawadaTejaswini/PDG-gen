import java.util.Scanner;



public class Main{
    public static void main(String[] args){
        int i,j,k,l;
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int intarr[]=new int[n];
        int pivot[]=new int[n];
        int a=0;
        for(i=0;i<n;i++){
            intarr[i]=sc.nextInt(); 
        }
        int qlong=sc.nextInt();
        int qintarr[]=new int[qlong];
        for(i=0;i<qlong;i++){
            qintarr[i]=sc.nextInt();
        }

        
        int sum;
        int flag;

        for(i=0;i<qlong;i++){ 
            flag=0;
            
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){  
                    pivot[k]=n-1-k;
                }
                while(true){
                    sum=0;                
                    for(k=0;k<=j;k++){
                        sum+=intarr[pivot[k]];
                    }
                    if(sum==qintarr[i]){
                        flag=1;
                        break;
                    }
                    if(pivot[j]>0){
                        pivot[j]--;
                    }else{
                        for(k=0;k<=j;k++){
                            if(pivot[j-k]>k){
                                break;
                            }
                        }
                        if(k>j){
                            break;
                        }
                        pivot[j-k]--;
                        for(l=1;l<=k;l++){
                            pivot[j-k+l]=pivot[j-k+l-1]-1;
                        }
                    }
                }
                if(flag==1){
                    break;
                }               
                
            }
            if(flag==0){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
    
    
}
