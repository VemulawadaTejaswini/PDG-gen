import java.util.*;
 
 
class Main{
 
    Main(){
        Scanner sc = new Scanner(System.in);
         
        int x=sc.nextInt(),y=sc.nextInt();
        int ans=0;
         
        for(int i=0;i<10000000;i++){
            ans++;
            System.out.println(ans);
            ans--;
            System.out.println(ans);
        }
         
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                ans++;
            }
        }
             
        System.out.println(ans);
    }
     
    public static void main(String[] args){
        new Main();
    }
}