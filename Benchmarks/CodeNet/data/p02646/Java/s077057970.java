import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        int dist = b-a;
        
        for(int i=0; i<t; i++){
            dist = dist-v+w;
        }
        
        if(dist<=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
   }
}
