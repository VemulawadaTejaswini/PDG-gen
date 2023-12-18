import java.util.*; 
class Main {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int sam = sc.nextInt();
       int aaa = sc.nextInt();
       
       aaa = aaa * 2;
       int cnt = 0;
       if(aaa >= sam){
           System.out.print(0);
       }else{
           System.out.print(sam - aaa);
       }

     
   }
}
