import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        String[] ar = moji.split("");
        Arrays.sort(ar);
        if((ar[0].equals(ar[1]))  && (ar[2].equals(ar[3])) && (ar[0].equals(ar[3]))){
            System.out.println("No");
        }
        else if((ar[0].equals(ar[1])) && (ar[2].equals(ar[3]))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
