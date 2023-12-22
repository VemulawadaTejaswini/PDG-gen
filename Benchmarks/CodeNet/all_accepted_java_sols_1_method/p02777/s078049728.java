import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] data1 = (sc.nextLine()).split(" ");
        String[] data2 = (sc.nextLine()).split(" ");
        int n1 = Integer.parseInt(data2[0]);
        int n2 = Integer.parseInt(data2[1]);
        String str = sc.nextLine();
        if(str.equals(data1[0])){
            n1--;
        } else {
            n2--;
        }
        System.out.println(n1 + " " + n2);
    }
}
