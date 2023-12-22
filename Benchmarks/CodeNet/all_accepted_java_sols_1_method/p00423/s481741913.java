import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int n = scan.nextInt();
        int k= 0;
        int f;
       int i;
        int A;
       int B;
       int GA[] = new int[5];
        int GB[] = new int[5];
       
        
        
         while(n != 0 && k < 5 ){
         
         
        
      
            
        for (i = 0; i < n; i++) {
            A = scan.nextInt();
            B = scan.nextInt();
            if (A > B) {
                GA[k] = GA[k] + A + B;
            } else if (B > A) {
                GB[k] = GB[k] + A + B;
            } else {
                GA[k] = GA[k] + A;
                GB[k] = GB[k] + B;
            }
        }
            
        k++;
         n = scan.nextInt();
          
    
        
       
        }
           for(f = 0;f<k;f++){
            System.out.println(GA[f]+" "+GB[f]);

    }
        
    }
}
