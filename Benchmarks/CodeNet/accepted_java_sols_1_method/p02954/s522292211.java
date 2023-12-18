import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Integer, Integer> map = new HashMap<>();
        int prevIndex = 0;
        int currIndex = 0;
        int index = 0;
        while(currIndex < str.length()) {
            while(str.charAt(currIndex) == 'R') currIndex++;
            index = currIndex - 1;
            while(currIndex < str.length() && str.charAt(currIndex) == 'L') currIndex++;
            int leftNum = index - prevIndex;
            int rightNum = currIndex - index - 2;
            map.put(index, (leftNum / 2) + (int)(Math.ceil(rightNum / 2.0)) + 1);
            map.put(index+1, (int)(Math.ceil(leftNum / 2.0)) + (rightNum / 2) + 1);
            prevIndex = currIndex;
        }
        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(i)) System.out.print(map.get(i) + " ");
            else System.out.print("0 ");
        }
        System.out.println();
    }
}
