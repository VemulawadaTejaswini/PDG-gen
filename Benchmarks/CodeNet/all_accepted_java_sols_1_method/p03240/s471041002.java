import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int[] x =new int[N];
        int[] y =new int[N];
        int[] h =new int[N];
        
        for(int i=0;i<N;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        for(int X =0;X<=100;X++){
            for(int Y=0;Y<=100;Y++){
                boolean ok=true;
                int H=0;
                for(int i=0;i<N;i++){
                    if(h[i]!=0){
                        H=Math.abs(x[i]-X)+Math.abs(y[i]-Y)+h[i];
                    }
                }
                for(int i=0;i<N;i++){
                    if(h[i]!=0){
                        if(H != Math.abs(x[i]-X)+Math.abs(y[i]-Y)+h[i]){
                            ok=false;
                        }
                    }else{
                        if(H > Math.abs(x[i]-X)+Math.abs(y[i]-Y)){
                            ok=false;
                        }
                    }
                }
                if(ok){
                    System.out.println(X +" "+Y+" "+H);
                }
            }
        }
    }
}