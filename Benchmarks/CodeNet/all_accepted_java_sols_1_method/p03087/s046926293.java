import java.util.*;
public class Main {
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
            }
            else
                arr[i]=co;
        }
        for(int i=0;i<q;i++)
        {
            int l=input.nextInt();
            int r=input.nextInt();
            int count=arr[r-1]-arr[l-1];

            System.out.println(count);
        }
    }
}
