import java.util.*;

class Main{
public static void main(String[] args){
 Scanner sc =new Scanner(System.in);
         int   N = sc.nextInt();
         int   X=  sc.nextInt();
         int   Y= sc.nextInt();
         System.out.print(Math.min(X,Y)+" ");
        if(N>(X+Y)){
         System.out.print(0);
}else if(N==X&&N==Y){
System.out.print(N);
}else if(N==X||N==Y) {
System.out.print(Math.min(X,Y));
//}else if((N==X||N==Y)&&(X==0||Y==0)){
//System.out.print(0);
}else{
System.out.print((X+Y)-N);
}           
   }
}