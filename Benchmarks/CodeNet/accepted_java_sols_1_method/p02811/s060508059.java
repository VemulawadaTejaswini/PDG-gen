import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int x = sc.nextInt();
        
        int total = 500*k;
        
        if(total>=x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}