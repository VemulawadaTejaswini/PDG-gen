import java.util.Scanner;
class Main{
    public static void main(String[]arge){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []A=new int[n];
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        int flag,hozon,count=0;
        flag=1;
        while(flag==1){
            flag = 0;
            for(int j=n-1; j>0; j--){
                if(A[j]<A[j-1]){
                hozon=A[j];
                A[j]=A[j-1];
                A[j-1]=hozon;
                flag=1;
                count+=1;
                }
                
            }        
            
     }
        for(int k=0; k<n; k++){
            
            if(k==n-1)System.out.print(A[k]);          
            if(k!=n-1)System.out.print(A[k]+" "); 
        }
            System.out.println("");
            System.out.println(count);   
   }
}    