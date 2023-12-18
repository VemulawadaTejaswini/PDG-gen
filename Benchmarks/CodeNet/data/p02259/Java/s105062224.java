import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,p,q=0;
        n=scan.nextInt();
        int[] sort=new int[n];
        for(int i=0; i<n; i++){
            sort[i]=scan.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(sort[j]>sort[j+1]){
                    sort[j]^=sort[j+1];
                    sort[j+1]^=sort[j];
                    sort[j]^=sort[j+1];
                    q++;
                }
            }
        }
        //System.out.println(Arrays.toString(sort));
        for(int i=0; i<n; i++){
            System.out.print(sort[i]);
            if(i!=n-1)
                System.out.print(" ");
        }
        System.out.println();
        System.out.println(q);
    }
}
