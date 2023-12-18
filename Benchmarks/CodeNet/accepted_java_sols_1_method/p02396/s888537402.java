import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 0;       
        
        while(sc.hasNext()){
            StringBuilder sb = new StringBuilder();
            int x = Integer.parseInt(sc.next());
            if(x == 0)break;
            else{
                i++;
                sb.append("Case ").append(i).append(": ").append(x);
                System.out.println(sb);
            }
            
        }

    }

}

