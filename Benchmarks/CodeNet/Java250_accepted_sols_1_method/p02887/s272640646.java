import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();        
        String S = sc.next();  

       int i ;
       int m = 0 ;

       String[]  stringArray;        
       stringArray= new  String[N];

       for(i = 1 ; i <= N ; i++) {

             stringArray[i-1]  = S.substring(i-1, i);
      //    System.out.println(stringArray[i-1]);
       }
    
       for(i = 1 ; i < N ; i++) {

             if  (stringArray[i-1].equals(stringArray[i] ) )  {
            
             } else  {
               m = m + 1;
             }

       }
     if (N > 0 ) {  
          System.out.println(m+1);
           }
     }

} 
