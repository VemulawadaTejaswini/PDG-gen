import java.util.*;

 
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumsum=0;
        int sum=0;
        double dev=0;
        int x;
        double devdev=0;
        

 
        while (n!=0){
            for(int i=0;i<n;i++){
            x = sc.nextInt();
            sum=sum+x;
            sumsum=sumsum+x*x;
            System.out.printf("sum = %d sumsum = %d\n",sum,sumsum);
            

        }

            
            devdev=(1.0*sumsum)/n-(1.0*sum/n)*(1.0*sum/n);
            dev=Math.sqrt(devdev);
            System.out.printf("%f\n",dev);
            sum=0;
            sumsum = 0;
            n = 0;
            x = 0;
    
            n = sc.nextInt();

        }
            
            

        }
    }


    