import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        char[] Sc = S.toCharArray();

        int index = Sc.length/2;
        int count = 0;

        for(int i=0; i < index ; i++) {
            if(Sc[i] != Sc[(Sc.length-1)-i]){
               count++;
           }
        }
        System.out.println(count);

    }
}
