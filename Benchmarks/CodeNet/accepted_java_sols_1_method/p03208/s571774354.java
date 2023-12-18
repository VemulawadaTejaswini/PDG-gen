import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i=0;
        int [] tree=new int [n];
        
        int [] tree1=new int [n];
        while(i<n)
        {
            tree[i] = sc.nextInt();
            i++;
        }
        Arrays.sort(tree);
        int m=n;
        for(i=0;i<n;i++)
        {
            tree1[i]=tree[m-1];
            m--;
        }
        
        
        
        int [] result = new int[n];
        for(i=0;i+k<=n;i++)
        {
            int j = i;
            result[i]=tree1[j]-tree1[j+k-1]; 
            j++;
            
        }
        Arrays.sort(result);
        System.out.println(result[n-i]);
        
    }

}