import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int index=0;
        int max=0;
        int nexmax=0;
        int inde2=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(max<=a[i]){
                nexmax=max;
                inde2=index;
                max=a[i];
                index=i;
            }
            else if(nexmax<=a[i]){
                nexmax=a[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i!=index){
                System.out.println(max);
            }
            else{
                System.out.println(nexmax);
            }
        }
        
    }
}
