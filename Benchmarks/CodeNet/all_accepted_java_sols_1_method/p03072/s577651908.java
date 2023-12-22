import java.util.*; 
class Main {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int h[] = new int [N]; 
       int con = 1;
       int a = 0;
     
     for(int i =0;i<N;i++){
      h[i] = sc.nextInt();
     }
     
      for(int i = 1;i<N;i++){
        a = Math.max(h[i-1],a);
        if(a<=h[i]){con++;}
      }
       
     
     
     System.out.print(con);


   }
}
