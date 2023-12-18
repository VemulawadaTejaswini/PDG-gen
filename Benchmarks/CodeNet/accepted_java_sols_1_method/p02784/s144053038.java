    import java.util.Scanner;
     
     
    public class Main {
        

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h =sc.nextInt();
            int n =sc.nextInt();
            int sum=0;
            for (int i=0;i<n;i++){
                 int a =sc.nextInt();
                 sum+=a;
            }

           if (h<=sum){
            System.out.println("Yes");
           }else{
            System.out.println("No");
           }
            
           } 
        }
    
