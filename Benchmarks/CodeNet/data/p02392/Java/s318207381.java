import java.util.Scanner; 
class Main {
   public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     int b = scan.nextInt();
     int c = scan.nextInt();
     if(c< b && b < a){
         System.out.println("YES");
     }
     else{
       System.out.println("NO");
     }
  }
}
