import java.util.*;

public class Main {
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input=new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<Integer>();
        for (int i=0; i<n; i++) {
            Integer tmp=input.nextInt();
            array.add(0,tmp);
        }
        for (int i=0; i<n; i++) {
            System.out.printf("%d ",array.get(i));
        }
        System.out.println("");
    }
}