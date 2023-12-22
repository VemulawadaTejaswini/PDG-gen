
import java.util.*;
public class Main {
  
  //////HELLO STALKER, SORRY BUT I HAD DONE IT AFTER TAKING HELP OF EDITORIAL
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        int n=input.nextInt();
        
        ArrayList <Integer>ind=new <Integer>ArrayList();
        
        int q=input.nextInt();
        
        System.out.flush();
        
        String str=input.next();
        
        int max=0;
        int co=0;
        int arr[]=new int[n];
        arr[0]=0;
        for(int i=1;i<n;i++)
        {
            if(str.charAt(i-1)=='A'&& str.charAt(i)=='C')
            {
                ind.add(i);
                co++;
                arr[i]=co;
//                if(ind.get(i)>max)
//                    max=ind.get(i);
                
            
            }
            else
                arr[i]=co;
        
        
        
        }
        
        
        for(int i=0;i<q;i++)
        {
            
            int l=input.nextInt();
            int r=input.nextInt();
            int count=arr[r-1]-arr[l-1];
//            if(l==1&&r==n)
//                System.out.println(ind.size());
//            else{
//            for(int j=0;j<ind.size();j++)
//            {
//                if(((ind.get(j)>=l-1)&&(ind.get(j)<=r-1))&&((ind.get(j)+1>=l-1)&&(ind.get(j)+1<=r-1)))
//                    count++;
//                if(ind.get(j)>r-1)
//                    break;
//                if(l-1>max)
//                    break;
//            }
            System.out.println(count);
            
            
        }
        
        
        
    }
    
}
