import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int x=scan.nextInt();
        int element, outpint;
        int[] out=new int[x+1];
        
        for(int i=0; i<n; i++){
            outpint=0;
            for(int j=0; j<x; j++){
                out[j]+=element=scan.nextInt();
                System.out.print(element+" ");
                outpint+=element;
            }
            System.out.println(outpint);
        }
        for(int j=0; j<x; j++){
            System.out.print(out[j]+" ");
        }
        System.out.println(Arrays.stream(out).sum());
    }
}
