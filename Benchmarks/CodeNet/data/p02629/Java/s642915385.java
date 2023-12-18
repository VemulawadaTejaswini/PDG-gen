import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   long n =kbd.nextLong();
   int x=(int)(Math.log(n)/Math.log(26))+1; //答えの桁数
   long[] A= new long[x+1];
   String[] B= new String[x+1];

   for(int i=1;i<=x;i++){
   A[i]=n%26;
   n=n/26;
   if(A[i]==1){B[i]="a"; continue;}
   if(A[i]==2){B[i]="b"; continue;}
   if(A[i]==3){B[i]="c"; continue;}
   if(A[i]==4){B[i]="d"; continue;}
   if(A[i]==5){B[i]="e"; continue;}
   if(A[i]==6){B[i]="f"; continue;}
   if(A[i]==7){B[i]="g"; continue;}
   if(A[i]==8){B[i]="h"; continue;}
   if(A[i]==9){B[i]="i"; continue;}
   if(A[i]==10){B[i]="j"; continue;}
   if(A[i]==11){B[i]="k"; continue;}
   if(A[i]==12){B[i]="l"; continue;}
   if(A[i]==13){B[i]="m"; continue;}
   if(A[i]==14){B[i]="n"; continue;}
   if(A[i]==15){B[i]="o"; continue;}
   if(A[i]==16){B[i]="p"; continue;}
   if(A[i]==17){B[i]="q"; continue;}
   if(A[i]==18){B[i]="r"; continue;}
   if(A[i]==19){B[i]="s"; continue;}
   if(A[i]==20){B[i]="t"; continue;}
   if(A[i]==21){B[i]="u"; continue;}
   if(A[i]==22){B[i]="v"; continue;}
   if(A[i]==23){B[i]="w"; continue;}
   if(A[i]==24){B[i]="x"; continue;}
   if(A[i]==25){B[i]="y"; continue;}
   if(A[i]==0){B[i]="z"; continue;}
}
  for(int i=x;i>0;i--){
   System.out.printf(B[i]);
 }
    System.out.println("");
}
}
