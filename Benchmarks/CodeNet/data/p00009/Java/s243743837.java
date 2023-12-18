import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int a=0;
            int b[]=new int[n+1];
            if(n < 2){
                System.out.println("0");
            }else{
                for(int i=2;i<=n;i++){
                    if (b[i]==0){
                      for(int j=i*2; j<=n; j = j+i){
                          b[j]=1;
                       }
                      }        
                    }
                   for(int i=2; i<=n; i++){
                     if(b[i]==0)a++;
                   
                   }
                   System.out.println(a);
            }
         }
             
    }
}