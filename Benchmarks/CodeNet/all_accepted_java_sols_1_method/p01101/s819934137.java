import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       while(true){
            int n= sc.nextInt();
            int m= sc.nextInt();
            if(n==0 &&  m==0) break;
            int max = 0;
            int [] price = new int[n];
            for(int i=0;i<n;i++){
                price[i]=sc.nextInt();
            }
            
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(price[i]+price[j]>max && price[i]+price[j]<=m){
                        max=price[i]+price[j];
                    }
                }
            }
            
            if(max==0){
                System.out.println("NONE");
            }else{
                System.out.println(max);
            }
       }
    }
}

