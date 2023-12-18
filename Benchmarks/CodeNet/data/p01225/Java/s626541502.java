import java.util.*;

public class Main {
    public static int[] value;
    public static char[] color;
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        int TC = in.nextInt();
        while (TC-- > 0) {
            value = new int[9];
            color = new char[9];
            
            for (int i = 0; i < 9; i++) {
                value[i] = in.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                color[i] = in.next().charAt(0);
            }
            
            if (shwe("", 0, new boolean[9])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
    
    public static boolean isValid(int a, int b, int c) {
        if (color[a] != color[b] || color[a] != color[c]) return false;
        if (value[a] == value[b] && value[a] == value[c]) return true;
        int[] arr = {value[a], value[b], value[c]};
        Arrays.sort(arr);
        if (arr[0] == arr[1] - 1 && arr[1] == arr[2] - 1) return true;
        return false;
    }
    
    public static boolean isValid(String str) {
        int a = Integer.parseInt(str.charAt(0)+"", 10);
        int b = Integer.parseInt(str.charAt(1)+"", 10);
        int c = Integer.parseInt(str.charAt(2)+"", 10);
        return isValid(a, b, c);
    }
    
    public static boolean shwe(String ans, int pos, boolean[] visited) {
        if (ans.length() == 9) {
            if (isValid(ans.substring(6))) return true;
            return false;
        }
        if (ans.length() == 6 && !isValid(ans.substring(3))) return false;
        if (ans.length() == 3 && !isValid(ans)) return false;
        if (pos >= 9) return false;
        if (visited[pos]) return shwe(ans, pos+1, visited);
        
        boolean ret = shwe(ans, pos+1, visited);
        visited[pos] = true;
        ret = ret || shwe(ans+pos+"", 0, visited);
        visited[pos] = false;
        
        return ret;
    }
}

