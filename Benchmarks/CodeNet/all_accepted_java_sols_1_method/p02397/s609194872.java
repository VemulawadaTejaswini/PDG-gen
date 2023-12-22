import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            
            if(x==0 && y==0) break;
            else{
                StringBuilder result = new StringBuilder();
                result.append(Math.min(x,y))
                .append(" ")
                .append(Math.max(x,y));
                System.out.println(result);
            }
        }
    }
}

