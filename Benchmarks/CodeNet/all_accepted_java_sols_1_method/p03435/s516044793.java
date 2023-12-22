import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < 9; i++) {
            list.add(sc.nextLong());
        }

        for (int a1 = 0; a1 <= list.get(0); a1++) {
            List<Long> list2 = new ArrayList<Long>();
            long b1 = list.get(0) - a1;
            long b2 = list.get(1) - a1;
            long b3 = list.get(2) - a1;
            long a2 = list.get(4) - b2;
            long a3 = list.get(8) - b3;

            list2.add(a1 + b1);
            list2.add(a1 + b2);
            list2.add(a1 + b3);
            list2.add(a2 + b1);
            list2.add(a2 + b2);
            list2.add(a2 + b3);
            list2.add(a3 + b1);
            list2.add(a3 + b2);
            list2.add(a3 + b3);

            boolean flag = true;
            for (int i = 0; i < 9; i++) {
                if(list.get(i) < 0 || list2.get(i) < 0){
                    flag = false;
                    break;
                }
                if(! list.get(i).equals(list2.get(i))){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
        return;
    }
}
