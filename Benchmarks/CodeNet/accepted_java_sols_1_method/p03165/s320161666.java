import java.util.*;
class Main
{
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = sc.next();
        int n = str.length();
        int m = str1.length();
        int res[][] = new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            res[i][0]=0;
        }
        for(int i=0;i<=m;i++)
        {
            res[0][i]=0;
        }
        String rest="";
        int max = -1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(str.charAt(i-1)!=str1.charAt(j-1))
                {
                    res[i][j]=Math.max(res[i-1][j],res[i][j-1]);
                }
                else
                {
                    res[i][j]=res[i-1][j-1]+1;
                }
            }
        }
        int index = res[n][m]; 
        int temp = index;
        char[] lcs = new char[index]; 
        int i = n; 
        int j = m; 
        while (i > 0 && j > 0) 
        { 
            if (str.charAt(i-1) == str1.charAt(j-1)) 
            { 
                lcs[index-1] = str.charAt(i-1);  
                i--;  
                j--;  
                index--;      
            } 
            else if (res[i-1][j] > res[i][j-1]) 
                i--; 
            else
                j--; 
        } 
        String stt = "";
        for(int k=0;k<temp;k++) 
            {
                stt+= Character.toString(lcs[k]);
            }
            System.out.println(stt);
    }
}