import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int count = stdIn.nextInt();
        
        for(int i = 0; i < count; i++){
            int side[] = {stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt()};

            Arrays.sort(side);
            
            if(side[0] * side[0] + side[1] * side[1] == side[2] * side[2]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        stdIn.close();
    }
}
