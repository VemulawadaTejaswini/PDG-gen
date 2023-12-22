import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int max1=0;
        int min2=w;
        int max3=0;
        int min4=h;
        int n=sc.nextInt();
        int tmpx;
        int tmpy;
        for(int i=0;i<n;i++){
            tmpx=sc.nextInt();
            tmpy=sc.nextInt();
            switch(sc.nextInt()){
                case 1:
                    max1=Math.max(max1,tmpx);
                    break;
                case 2:
                    min2=Math.min(min2,tmpx);
                    break;
                case 3:
                    max3=Math.max(max3,tmpy);
                    break;
                case 4:
                    min4=Math.min(min4,tmpy);
            }
            
        }
        System.out.println(min2-max1<=0||min4-max3<=0?0:Math.abs((min2-max1)*(min4-max3)));
        
        
    }
 
    
}