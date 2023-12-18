import java.util.*;
 
public class Main {
    static final long MOD=1000000007;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[n];
        int[] output=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
        }
        if(n%2==1){
            output[n/2]=input[0];
            for(int i=1;i<n/2+1;i++){
                output[n/2-i]=input[i*2-1];
                output[n/2+i]=input[i*2];
            }
            for(int i=n;i>0;i--){
                System.out.print(output[i-1]+" ");
            }
        }else{
            output[n/2]=input[0];
            for(int i=1;i<n/2;i++){
                output[n/2-i]=input[i*2-1];
                output[n/2+i]=input[i*2];
            }
            output[0]=input[n-1];
            for(int i=0;i<n;i++){
                System.out.print(output[i]+" ");
            }
        }
        System.out.println();
    }
}
