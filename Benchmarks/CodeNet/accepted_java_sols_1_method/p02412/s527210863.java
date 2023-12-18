import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int x;
        int count;      
        while(true){
           n=sc.nextInt();
           x=sc.nextInt();
           count=0;
           if(n==0 && x==0){
              break;
           }
           for(int i=1;i<=n;i++){
               for(int j=1;j<=n;j++){
                   for(int k=1;k<=n;k++){
                     if(i+j+k==x){
                         if(i==j || i==k || j==k){
                         }
                         else{
                           count++;  
                         } 
                         
                     }
                   }
                }
            }
           System.out.println(count/6);
        }
    }
}
