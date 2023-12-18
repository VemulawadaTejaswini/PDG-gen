import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int n=kbd.nextInt();
   int d=kbd.nextInt();
   int num=0;

int[] X= new int[n];
int[] Y= new int[n];
for(int i=0;i<n;i++){
  X[i]=kbd.nextInt();
  Y[i]=kbd.nextInt();
}
for(int i=0;i<n;i++){
  if(d>=10){
if(Math.sqrt(X[i]/10*X[i]/10+Y[i]/10*Y[i]/10)<=d/10){
  num++;
}
}else{
  if(Math.sqrt(X[i]*X[i]+Y[i]*Y[i])<=d){
    num++;
  }
}
}
System.out.println(num);
}
}
