import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        boolean[] cards = new boolean[52];
        HashMap<String,Integer> mark = new HashMap<String,Integer>();
        mark.put("S",0);
        mark.put("H",1);
        mark.put("C",2);
        mark.put("D",3);
        HashMap<Integer,String> revmark = new HashMap<Integer,String>();
        revmark.put(0,"S");
        revmark.put(1,"H");
        revmark.put(2,"C");
        revmark.put(3,"D");
        for (int i = 0; i < n; i++){
            String mk = input.next();
            int num = input.nextInt();
            cards[mark.get(mk)*13 + num - 1] = true;
        }
        for (int i = 0; i < 52; i++){
            if (!cards[i]){
                int mk = i/13;
                int num = i%13 + 1;
                System.out.printf("%s %d\n",revmark.get(mk),num);
            }
        }
    }
}
