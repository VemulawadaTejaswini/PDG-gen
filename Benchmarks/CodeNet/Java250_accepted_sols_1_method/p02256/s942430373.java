import java.util.*;
   
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i;
   
        if(x<=y){
            i = y%x;
            while(i!=0){
                y = x;
                x = i;
                i = y%x;
            }
            System.out.println(x);
        }else{
            i = x%y;
            while(i!=0){
                x = y;
                y = i;
                i = x%y;
            }
            System.out.println(y);
        }
    }
}