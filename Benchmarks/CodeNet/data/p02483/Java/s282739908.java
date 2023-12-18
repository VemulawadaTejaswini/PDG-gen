import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = nextInt();
  int b = nextInt();
  int c = nextInt();
  if(a<b){
   if(b<c){
    System.out.println("%d %d %d\n",a,b,c);
   }else if(a<c){
      if(c<b){
    System.out.println("%d %d %d\n",a,c,b);
   }else{
      System.out.println("%d %d %d\n",c,a,b);
   }
  }
 }else{
    if(a<c){
    System.out.println("%d %d %d\n",b,a,c);
    }else if(b<c){
      if(c<a){
        System.out.println("%d %d %d\n",b,c,a);
       }else{
        System.out.println("%d %d %d\n",c,b,a);
       }
     }
 }

 }

}