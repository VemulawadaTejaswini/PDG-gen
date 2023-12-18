import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        String s = new String(scan.next());

        int count = 0;
        while(true){
            int i;
            if((i = s.indexOf("ABC")) != -1){
                count++;
                s = s.substring(i+2);
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
