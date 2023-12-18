import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a,b,i,j,l;
while(true){

a=scan.nextInt();
b=scan.nextInt();
if(a==0&&b==0){
  System.out.print(" ");
  break;
}
for(j=0;j<a;j++){
if(j%2==0){
 for(i=0;i<b;i++){

  if(i % 2==0){
    System.out.print("#");
  }else if(i % 2!=0){
    System.out.print(".");
  }
}System.out.println(" ");
}else if(j%2==1){
for(l=0;l<b;l++){

 if(l % 2==0){
   System.out.print(".");
 }else if(l % 2!=0){
   System.out.print("#");
 }
}
  System.out.println(" ");

}
}}
}
}

