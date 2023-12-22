
import java.util.*;
public class Main{
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  ArrayList<String> array = new ArrayList<String>();
double N=sc.nextDouble();
double n=Math.floor(Math.sqrt(2*N))+1;
System.out.println(n*(n-1)==2*N?"Yes":"No");
if(n*(n-1)==2*N){
int s[][]=new int[(int)n][(int)n-1];
  int now=0;
int num=1;
  while(num<=N){  
  for(int i =now;i<(int)n-1;i++){
        s[now][i]=num;
           s[i+1][now]=num;
           
           num++;
     }
  now++;
  }
System.out.println((int)n);
 for (int k=0;k<(int)n;k++){
   System.out.println((int)n-1);
     for (int l=0;l<(int)n-1;l++){
     System.out.println(s[k][l]); 
    }
   }
     }
    }
}