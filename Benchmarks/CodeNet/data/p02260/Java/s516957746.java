import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,minN,q=0;
        n=scan.nextInt();
        int[] sort=new int[n];
        for(int i=0; i<n; i++){
            sort[i]=scan.nextInt();
        }
        //System.out.println(Arrays.toString(sort));
        
        for(int i=0; i<n; i++){
            minN=i;
            for(int j=i+1; j<n; j++){
                if(sort[minN]>sort[j]){
                    minN=j;
                }
            }
            if(minN!=i){
                sort[i]^=sort[minN];
                sort[minN]^=sort[i];
                sort[i]^=sort[minN];
                q++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(sort[i]);
            if(i!=n-1)
                System.out.print(" ");
            else
                System.out.println();
        }
        System.out.println(q);
    }
}
