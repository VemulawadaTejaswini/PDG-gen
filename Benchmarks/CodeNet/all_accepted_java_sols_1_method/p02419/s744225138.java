import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W, temp, smallW, smallt;
        ArrayList<String> t = new ArrayList<String>();
        int count = 0;

        W = sc.next();

        while(true){
            temp = sc.next();
            if(temp.equals("END_OF_TEXT")) break;
            t.add(temp);
        }

        for(int i = 0; i < t.size(); i++){
            smallW = W.toLowerCase();
            smallt = t.get(i).toLowerCase();
            if(smallt.equals(smallW)) count++;
        }

        System.out.println(count);

        sc.close();
    }
}
