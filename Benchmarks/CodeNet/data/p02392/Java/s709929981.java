import java.util.Scanner; 
class Main {
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     int b = scan.nextInt();
     int c = scan.nextInt();
     if(a < b){
       if(b < c){
         System.out.println("YES");
       }
       else{
         System.out.println("NO");
       }
     }
     else{
       System.out.println("NO");
     }
  }
}
