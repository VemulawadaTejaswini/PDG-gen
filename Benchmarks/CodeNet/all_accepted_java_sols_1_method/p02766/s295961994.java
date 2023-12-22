import java.util.*;
class Main
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int total = n;
            int count = 0;
            
            while(total!=0){
                total/=k;
                count++;
            }
            
            System.out.println(count);
        }
        
}  