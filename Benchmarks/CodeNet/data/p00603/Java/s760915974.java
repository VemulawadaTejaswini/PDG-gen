import java.io.*;
public class Main {
 public static void main(String[] args){
 try{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  while(true){
   int ac=0,bc=0,r=0,n=0,x=0;
   int a[];
   a=new int[100];  
   int b[];
   b=new int[100];  
   int c[];
   c=new int[100]; 
   int ans[];
   ans= new int[100];
  for(int i=0;i<100;i++)ans[i]=i;
   String str[];
   str= new String[100];
   str=br.readLine().split(" ");
   n=Integer.parseInt(str[0]);
   r=Integer.parseInt(str[1]);
   str=br.readLine().split(" ");
   for(int l=0;l<r;l++){
    x=Integer.parseInt(str[l]);
    for(int i=0;i<n/2;i++){b[i]=ans[i];bc=i+1;}
    b[bc]=-1;
    ac=n-bc;
    for(int i=0;i<ac;i++){a[i]=ans[bc+i];}
    a[ac]=-1;
    int j=0;int w=0;int k=0;

    while(true){//シャッフル
     if(ac==0 && bc==0)break;
     int cnt=0;
     while(true){
      if(cnt==x || a[j]==-1)break;
      c[k]=a[j]; cnt++; ac--; k++; j++;
     }
    cnt=0;
     while(true){
      if(cnt==x || b[w]==-1)break; 
      c[k]=b[w]; k++;cnt++;bc--; w++;
     }
    }
    for(int i=0;i<n;i++)ans[i]=c[i]; 
   }
   System.out.println(ans[n-1]);   
  }
 }
  catch(Exception e){return ;}
 }
}
