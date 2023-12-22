
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        long[] m = new long[n+1];
        long[] h = new long[n];
        for(int i=0;i<=n;i++){
            m[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            h[i]=in.nextInt();
        }
        long count=0;
        for(int i=0;i<n;i++){
            if(h[i]>=m[i]){
                count+=m[i];
                //System.out.println(count);
                h[i]=h[i]-m[i];
                m[i]=0;

                if(h[i]>0){
                    if(h[i]>=m[i+1]){
                        count+=m[i+1];
                        //System.out.println(count);
                        m[i+1]=0;
                       // h[i]=0;

                    }else{
                        m[i+1]-=h[i];
                        count+=h[i];
                        //System.out.println("Yo"+count + " " + h[i]);
                    }

                }

            }else{
                m[i]-=h[i];
                count+=h[i];
                //System.out.println(count);
            }
        }
        System.out.println(count);

    }
}
