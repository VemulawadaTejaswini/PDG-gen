import java.util.*;

public class Main {
    static String changeNumber(String str, char num1, char num2) {
        String tmp = str.replace(num1, '8');
        tmp = tmp.replace(num2, num1);
        tmp = tmp.replace('8', num2);
        return tmp;
    }

    public static void main(String[] args) throws IllegalStateException {
        Map<String, Integer> map = new HashMap<>();
        Deque<String> deque = new ArrayDeque<>();
        map.put("01234567", 0);
        deque.addLast("01234567");

        while(deque.size() > 0) {
            String parent = deque.removeFirst();
            int index = parent.indexOf("0");
            if(index <= 3) {
                String child = changeNumber(parent, '0', parent.charAt(index+4));
                if(!map.containsKey(child)) {
                    map.put(child, map.get(parent)+1);
                    deque.addLast(child);
                }
            }
            if(index >= 4) {
                String child = changeNumber(parent, '0', parent.charAt(index-4));
                if(!map.containsKey(child)) {
                    map.put(child, map.get(parent)+1);
                    deque.addLast(child);
                }
            }
            if(index % 4 <= 2) {
                String child = changeNumber(parent, '0', parent.charAt(index+1));
                if(!map.containsKey(child)) {
                    map.put(child, map.get(parent)+1);
                    deque.addLast(child);
                }
            }
            if(index % 4 >= 1) {
                String child = changeNumber(parent, '0', parent.charAt(index-1));
                if(!map.containsKey(child)) {
                    map.put(child, map.get(parent)+1);
                    deque.addLast(child);
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = "";
            for(int i = 0; i < 8; i++) str += sc.next();
            if(map.containsKey(str)) System.out.println(map.get(str));
        }
        sc.close();
    } 
}
