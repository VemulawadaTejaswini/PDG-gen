import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    int R[] =new int[M];
    int S[] =new int[2*M];
    int T[] =new int[M];
    int U[] =new int[M];
    int V[] =new int[M];
    int W[] =new int[M];
    int X[] =new int[M];
    int Y[] =new int[M];
    int Z[] =new int[M];
    for(int i =0;i<2*M;i++){
      S[i]=sc.nextInt();}
    for(int j=0;j<M;j++){
      T[j]=S[2*j];
      U[j]=S[2*j+1];}
      int x=0;
    for(int k=0;k<M;k++){
      for(int l=0;l<k;l++){
        if(T[l]==T[k]){
          if(!(U[l]==U[k])){System.out.println(-1);
                          System.exit(0);}}}
             if(T[k]==1){ x= x+100;X[k]=T[k];V[k]=U[k];}
             else if(T[k]==2){x=x+10;Y[k]=T[k];W[k]=U[k];}
             else{x=x+1;Z[k]=T[k];R[k]=U[k];}
    }int b=0;int c=0;int d =0;int e=0; int f=0;int g =0;
    for(int a=0;a<M;a++){b=b+X[a];c=c+Y[a];d=d+Z[a];e=e+V[a];f=f+W[a];g=g+R[a];}
    if(b>1){x=x-100*b+100;e=e/b;}
    if(c>3){x=x-10*c/2+10;f=2*f/c;}
    if(d>5){x=x-d/3+1;g=3*g/d;}
    if(N==3){if((((x==111)||(x==100))||((x==110)||(x==101)))&&
      (e==0)){System.out.println(-1);}
             else{
               if(x==111){System.out.println(100*e+10*f+g);}
               else if(x==11){System.out.println(100+10*f+g);}
               else if(x==101){System.out.println(100*e+g);}
               else if(x==100){System.out.println(100*e);}
               else if(x==110){System.out.println(100*e+10*f);}
               else if(x==10){System.out.println(100+10*f);}
               else if(x==1){System.out.println(100+g);}
               else{System.out.println(100);}}}
    else if(N==2){if(((x==110)||(x==100))&&
      (e==0)){System.out.println(-1);}
                  else{
                    if(x==110){System.out.println(10*e+f);}
                    else if(x==100){System.out.println(10*e);}
                    else if(x==10){System.out.println(10+f);}
                    else{System.out.println(10);}}}
    else{if(x==100){System.out.println(e);}
         else{System.out.println(0);}
        }    
  }
}