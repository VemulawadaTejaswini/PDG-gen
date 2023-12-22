import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    
    int t = 0;
    int ao = 0;
    for(int i=0; i<100; i++){
    if(c-b*i>0){
        t++;
        }
    if(a-d*i>0){
        ao++;
    }
}
        if(t<=ao){
       	System.out.println("Yes");
        }else{
        System.out.println("No");
    }
}
}
