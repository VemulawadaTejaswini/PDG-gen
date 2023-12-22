
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);
        while(true){
            String w= scanner.next();
            if(w.equals("-")) break;
            long m=scanner.nextLong();
            for(int i=0;i<m;i++){
                int h=scanner.nextInt();
                w=w.substring(h,w.length())+w.subSequence(0,h);
            }
            System.out.println(w);
        }

    }

}

