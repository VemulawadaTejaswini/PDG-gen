import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int happy = 0;
        
        while(X>0){
            if(X>=500){
                happy+=1000;
                X-=500;
            }else{
                break;
            }
        }
        
        happy+=(X/5)*5;
        
        System.out.println(happy);
    }
}
