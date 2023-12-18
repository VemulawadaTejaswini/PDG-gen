import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int m=sc.nextInt();
            if(m==0)
                break;
            int nmin=sc.nextInt();
            int nmax=sc.nextInt();
            Integer p[]=new Integer[m];
            int i;
            for(i=0;i<m;i++){
                p[i]=sc.nextInt();
            }
            Arrays.sort(p,Collections.reverseOrder());
            int gap=0;
            int j=0;
            
            for(i=nmin-1;i<nmax;i++){
                if(gap<=p[i]-p[i+1]){
                    gap=p[i]-p[i+1];
                    j=i+1;
                }
            }
            System.out.println(j);        
        }
    }
}


