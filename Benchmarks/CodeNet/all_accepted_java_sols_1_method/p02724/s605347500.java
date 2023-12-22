    import java.util.Scanner;
     
     
    public class Main {
        

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int sum500=0;
            int sum5=0;
            
            sum500=x/500;
            sum5=(x-sum500*500)/5;


            System.out.println(sum500*1000+sum5*5);



           } 
        }
    
