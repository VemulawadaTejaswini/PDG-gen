import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        int[] l = new int[n+1];
        int[] d = new int[n+2];
        for(int i=1;i<n+1;i++)l[i]=sc.nextInt();

        d[1]=0;
        int i;
        for(i=2;i<n+2;i++){
            d[i]=d[i-1]+l[i-1];
            //System.out.println(d[i]);
            if(d[i]>x){
                System.out.println((i-1));
                return;
            }
        }
        System.out.println((n+1));


    }

}
