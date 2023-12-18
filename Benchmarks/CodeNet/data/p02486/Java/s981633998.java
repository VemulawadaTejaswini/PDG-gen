import java.util.*;

 
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int i = 0;
        int j = 0;
        int k = 0;
        int sum = 0;

 
        while (!(n==0 && x==0)){
            for(i=1;i<=n-2;i++){
                for(j=i+1;j<=n-1;j++){
                    for(k=j+1;k<=n;k++){
                        if(i+j+k==x){
                  
                            sum++;
                        }
                    }
                }
            }

            System.out.printf("%d\n",sum);
            sum=0;
            i = 0;
            j = 0;
            k = 0;
    
            n = sc.nextInt();
            x = sc.nextInt();

        }
    }
}


    