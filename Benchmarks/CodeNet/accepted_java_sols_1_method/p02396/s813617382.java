import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int r = 1;
        while(input.hasNext()){
            int c = input.nextInt();
            if (c == 0)
                break;
            else{
                System.out.println("Case " + r + ": " + c);
                r++;
            }
        }
    }
}
