import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int a = sc.nextInt();
        
        int count = 0;
        
        do{
            count++;
            h-=a;
            if(h<=0){
                System.out.println(count);
            }
        }while(h>0);
    }
}