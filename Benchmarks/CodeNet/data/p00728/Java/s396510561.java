import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        
        while(!((n=sc.nextInt())==0)){
            int Max=0;
            int Min=1000;
            int sum=0;
            int a;
            
            for(int i=0;i<n;i++){
                a=sc.nextInt();
                sum+=a;
                if(Max<a){
                    Max=a;
                }
                if(Min>a){
                    Min=a;
                }
            }
            int ave=(sum-Max-Min)/(n-2);
            System.out.println(ave);
        }
    }
}
