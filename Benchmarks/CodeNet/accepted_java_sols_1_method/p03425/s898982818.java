import java.util.*;
import java.util.HashSet;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long m=0;
        long a=0;
        long r=0;
        long c=0;
        long h=0;
        String[]namae=new String[N];
        for(int i=0;i<N;i++){
            namae[i]=sc.next();
            char[]aa=namae[i].toCharArray();
            if(aa[0]=='M'){
                m++;
            }
            if(aa[0]=='A'){
                a++;
            }
            if(aa[0]=='R'){
                r++;
            }
            if(aa[0]=='C'){
                c++;
            }
            if(aa[0]=='H'){
                h++;
            }
        }
        long sum=0;
        sum+=m*a*r;
        sum+=m*a*c;
        sum+=m*a*h;
        sum+=m*r*c;
        sum+=m*r*h;
        sum+=m*c*h;
        sum+=a*r*c;
        sum+=a*r*h;
        sum+=a*c*h;
        sum+=r*c*h;
        System.out.println(sum);
        
        
        

        }
       
        
    }