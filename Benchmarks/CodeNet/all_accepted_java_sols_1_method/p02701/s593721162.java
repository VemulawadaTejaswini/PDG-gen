import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<String>();
        for (int i =0; i<n;i++){
            set.add(sc.next());
        }
        set.removeIf(s -> s.equals(""));
        System.out.println(set.size());
        }
    }
