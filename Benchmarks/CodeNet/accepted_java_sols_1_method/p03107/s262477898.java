import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] strs = str.split("");
        int zeros =0;
        int ones =0;

        for(int i=0;i<strs.length;i++){
            if(strs[i].equals("0")){
                zeros++;
            } else {
                ones++;
            }
        }
        System.out.println(Math.min(zeros,ones) * 2);

    }


}
