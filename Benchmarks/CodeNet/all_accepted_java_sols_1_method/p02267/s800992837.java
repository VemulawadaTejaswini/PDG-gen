import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,q,t,result=0;
        n=scan.nextInt();
        ArrayList<Integer> s=new ArrayList<Integer>();
        for(int i=0; i<n; i++)
            s.add(scan.nextInt());
        
        q=scan.nextInt();
        for(int i=0; i<q; i++){
            t=scan.nextInt();
            if(s.indexOf(t)!=-1)
                result++;     
        }
        
        System.out.println(result);
    }
}
