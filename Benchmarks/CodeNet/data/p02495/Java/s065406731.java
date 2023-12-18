import java.util.Scanner;
public class Main {
public static voidmain(String[] args) {
int n = 1;
int j = 1;
Scanner sc= newScanner(System.in);

while(true) {
intH = sc.nextInt();
intW= sc.nextInt();
if (H == 0 && W == 0) {
break;
}
while(n<=H){
     if(n%2 == 1){
         while(j<=W){
              if(j%2 == 1){
                      System.out.printf("#");
              }
              else{
                      System.out.printf(".");
              }
              
              j++;
         }
       
      else{
           while(j<=W){
              if(j%2 == 1){
                      System.out.printf(",");
              }
              else{
                      System.out.printf("#");
              }
              
              j++;
                     
        }   

        j =1;
}
         