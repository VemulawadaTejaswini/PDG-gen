import java.io.*;
public class Main {
 static  int h[];  
 public static void main(String[] args) {   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   try{
    while(true){
     String str[]=br.readLine().split(" ");
     int w=Integer.parseInt(str[0]);
     int q=Integer.parseInt(str[1]);
     if(w==0 && q==0)break;
     for(int i=0;i<w;i++)h[i]=0;
     for(int i=0;i<q;i++){
      str=br.readLine().split(" ");
      char ch=str[0].charAt(0);
      if(ch=='s'){
       int id=Integer.parseInt(str[1]);
       int cw=Integer.parseInt(str[2]);
       sleep(id,cw,w);
      }
      else{
       int id=Integer.parseInt(str[1]);
       wake(id,w);
      }
     }
    System.out.println("END");
    }
   }
   catch(Exception e){
   }
 }

 public static void sleep(int id, int cw , int w){
  int s=0, b=0,f=0;
  for(int i=0;i<w;i++){
   if(f==1)break;
   if(h[i]==0){
    b=i;
    for(int j=i;j<w;j++){
     if(h[j]!=0 || f==1){s=0;b=0;break;} 
     s++;
     if(s==cw){
      for(int k=0;k<=j;k++)h[k]=id;
      System.out.println(b);
      f=1;
     }
    }
   }
  }
  if(f==0)System.out.println("impossible");
 }

 public static void wake(int id, int w){
  for(int i=0;i<w;i++)
    if(h[i]==id)h[i]=0;
 }
}
