import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int l[]=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int count=0;
        Arrays.sort(l);
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int high=n;
                int low=0;
                while(high-low>1){
                    int middle=(high+low)/2;
                    if(l[middle]<l[j]+l[i]){
                        low=middle;
                    }else high=middle;
                }
                count+=high-j-1;
            }
        }
        System.out.println(count);
        
    }
}