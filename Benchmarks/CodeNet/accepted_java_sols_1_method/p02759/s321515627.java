import java.util.Scanner;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int N =sc.nextInt();

if(N!=0){
     int ans =N/2;
     int answer=N%2;
     if(answer==0){
     System.out.println(ans);
     }else{
     System.out.println(ans+1);}
}else{
System.out.println(0);
}
}
}