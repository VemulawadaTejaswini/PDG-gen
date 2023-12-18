import java.io.*;
public class Main {
 static int h[];
 public static void main(String[] args) {   
   h = new int[100];
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   try{
    while(true){
     String str[]=br.readLine().split(" ");
     int w=Integer.parseInt(str[0]);
     int q=Integer.parseInt(str[1]);
     if(w+q==0)break;
     for(int i=0;i<w;i++)h[i]=100;
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
System.out.println("err");
   }
 }

 public static void sleep(int id, int cw , int w){
  int s=0, b=0,f=0;
  for(int i=0;i<w;i++){
   if(f==1)break;
   if(h[i]==100){
    b=i;
    for(int j=i;j<i+cw;j++){
     if(h[j]!=100 || f==1){s=0;b=0;break;} 
     s++;
     if(s==cw){
      for(int k=b;k<b+cw;k++)h[k]=id;
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
    if(h[i]==id)h[i]=100;
 }
}
 
