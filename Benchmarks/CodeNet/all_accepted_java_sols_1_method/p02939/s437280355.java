import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        String s = stdIn.next();
        int[] n = new int[26];

        String[] ss = s.split("");

        int k = 1;

        String sss = ss[0];

        for(int i = 1;i < ss.length;i++){
            if(sss.length() >= 2 || !sss.equals(ss[i])){
                sss = ss[i];
                if(i == ss.length - 3){
                    if(ss[i+1].equals(ss[i+2])){
                        k += 2;
                        break;
                    }
                }
            }else {
                sss = ss[i] + ss[i+1];
                i++;
                if(i == ss.length - 3) {
                    if(ss[i+1].equals(ss[i+2])){
                        k += 2;
                        break;
                    }
                }
            }
            k++;
        }

        System.out.println(k);
    }

}