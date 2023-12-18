import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      int row = sc.nextInt();
      int col = sc.nextInt();
      int k = sc.nextInt();
      long val[][]=new long[row][col];
      long dp[][] = new long[row][col];
      PriorityQueue<Long> pq[] = new PriorityQueue[row];
      long sum[]=new long[row];
      for(int i=0;i<row;i++)
      {
          pq[i]=new PriorityQueue<>();
      }
      for(int i=0;i<k;i++)
      {
          int temp1 = sc.nextInt()-1;
          int temp2 = sc.nextInt()-1;
          val[temp1][temp2]=sc.nextLong();
      }
      if(val[0][0]>0)
      {
          dp[0][0]=val[0][0];
          pq[0].add(val[0][0]);
          sum[0]=val[0][0];
      }
      for(int i=1;i<col;i++)
      {
          if(val[0][i]>0 && pq[0].size()==3)
          {
              if(pq[0].peek() < val[0][i])
              {
                  sum[0]=sum[0]-pq[0].remove()+val[0][i];
                  dp[0][i]=sum[0];
                  pq[0].add(val[0][i]);
              }
              else
              {
                  dp[0][i]=dp[0][i-1];
              }
          }
          else if(pq[0].size()<3)
          {
              if(val[0][i]>0)
              {
                  sum[0]+=val[0][i];
                  pq[0].add(val[0][i]);
                  dp[0][i]=sum[0];
              }
              else
              {
                  dp[0][i]=dp[0][i-1];
              }
          }
          else
          {
              dp[0][i]=dp[0][i-1];
          }
      }
      for(int j=1;j<row;j++)
      {
          if(val[j][0]>0)
          {
              pq[j].add(val[j][0]);
              sum[j]=val[j][0];
          }
          dp[j][0]=dp[j-1][0]+val[j][0];
      }
      for(int i=1;i<row;i++)
      {
          for(int j=1;j<col;j++)
          {
              if(pq[i].size()==3)
              {
                  dp[i][j]=dp[i][j-1];
                  if(val[i][j]>pq[i].peek())
                  {
                      sum[i]=sum[i]-pq[i].peek()+val[i][j];
                      dp[i][j]= dp[i][j-1]-pq[i].remove()+val[i][j];
                      pq[i].add(val[i][j]);
                  }
              }
              else if(pq[i].size()<3)
              {
                  dp[i][j]=dp[i][j-1];
                  if(val[i][j]>0)
                  {
                      pq[i].add(val[i][j]);
                      sum[i]+=val[i][j];
                      dp[i][j]+=val[i][j];
                  }
              }
              if(dp[i-1][j]>dp[i][j])
              {
                  pq[i].clear();
                  sum[i]=0;
                  if(val[i][j]>0)
                  {
                      sum[i]=val[i][j];
                      pq[i].add(val[i][j]);
                  }
                  dp[i][j]=dp[i-1][j]+val[i][j];
              }
              else if((dp[i-1][j]+val[i][j])> dp[i][j])
              {
                  dp[i][j]=dp[i-1][j]+val[i][j];
                  pq[i].clear();
                  sum[i]=val[i][j];
                  pq[i].add(val[i][j]);
              }
          }
      }
      /*for(int i=0;i<row;i++)
      {
          for(int j=0;j<col;j++)
          {
              w.print(dp[i][j]+" ");
          }
          w.println();
      }*/
      w.println(dp[row-1][col-1]);
      w.close();
    }
}