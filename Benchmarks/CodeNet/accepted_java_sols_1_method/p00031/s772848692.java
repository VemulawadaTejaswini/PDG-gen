import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int g;
        while(true) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int d = 1024;
            try{
                g = sc.nextInt();
            }catch(Exception e) {
                break;
            }
            
            int ans = 0;
            for(int i = 1; i <= 10; i++) {
                d /= 2;
                if(g-ans < d) {
                    continue;
                }else if(g-ans > d) {
                    ans += d;
                    list.add(d);
                }else if(g-ans == d) {
                    ans += d;
                    list.add(d);
                    break;
                }
            }
            for(int i = list.size()-1; i >= 0; i--) {
                if(i != 0) {
                    System.out.print(list.get(i)+" ");
                }else {
                    System.out.println(list.get(i));
                }
            }
        } 
        
    }    
}

