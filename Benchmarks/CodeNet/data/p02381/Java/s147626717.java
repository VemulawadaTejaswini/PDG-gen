import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,n,j,S=0;
        double avr,O=0,s;
        for(i=0; ;i++){
            n=sc.nextInt();
            int array[]=new int[n];
            if(n==0){
                break;
            }else{
                for(j=1;j<=n;j++){
                    array[j-1]=sc.nextInt();
                    S+=array[j-1];
                }
                avr=S/(double)n;
                for(j=1;j<=n;j++){
                    O+=(avr-array[j-1])*(avr-array[j-1]);                    
                }
                s=Math.sqrt(O/n);
                System.out.println(s);
            }
            S=0;
            O=0;
        }
    }
} 
