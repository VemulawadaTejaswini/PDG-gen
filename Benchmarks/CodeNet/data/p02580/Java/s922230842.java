import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int h=in.nextInt();
        int w=in.nextInt();
        int m=in.nextInt();
        int[] row=new int[m];
        int[] col=new int[m];
        HashMap<Integer,Integer> rowCount=new HashMap<>();
        HashMap<Integer,Integer> colCount=new HashMap<>();
        HashSet<Long> occupied=new HashSet<>();
        int maxr=Integer.MIN_VALUE;
        int maxc=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            row[i]=in.nextInt();
            row[i]--;
            if(rowCount.containsKey(row[i]))
                rowCount.put(row[i],rowCount.get(row[i])+1);
            else
                rowCount.put(row[i],1);
            maxr=Math.max(maxr,rowCount.get(row[i]));
            col[i]=in.nextInt();
            col[i]--;
            if(colCount.containsKey(col[i]))
                colCount.put(col[i],colCount.get(col[i])+1);
            else
                colCount.put(col[i],1);
            maxc=Math.max(maxc,colCount.get(col[i]));
            occupied.add((long)w*row[i]+(long)col[i]);
        }
        ArrayList<Integer> validRows=new ArrayList<>();
        ArrayList<Integer> validCols=new ArrayList<>();
        for(int i=0;i<h;i++)
        {
            if(rowCount.containsKey(i) && rowCount.get(i)==maxr)
                validRows.add(i);
        }
        for(int i=0;i<w;i++)
        {
            if(colCount.containsKey(i) && colCount.get(i)==maxc)
                validCols.add(i);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<validRows.size();i++)
        {
            for(int j=0;j<validCols.size();j++)
            {
                int x=validRows.get(i);
                int y=validCols.get(j);
                int num=0;
                if(occupied.contains((long)w*x+(long)y))
                    num=rowCount.get(x)+colCount.get(y)-1;
                else
                    num=rowCount.get(x)+colCount.get(y);
                ans=Math.max(ans,num);
            }
        }
        System.out.println(ans);
    }
}