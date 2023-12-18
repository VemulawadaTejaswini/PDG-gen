import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        List <String> sList = new LinkedList<>(Arrays.asList(t.split("")));
        List <String> tList = new LinkedList<>(Arrays.asList(s.split("")));
        int flag = 0;
        int n = tList.size();
        for(int i = 0; i < n; i++){
            String a = tList.remove(n-1);
            tList.add(0,a);
            if(tList.equals(sList)){
                flag = 1;
                break;
            }
        }
        if(flag == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}