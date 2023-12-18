import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = in.nextInt();
        }
        int q = in.nextInt();
        while (q-- != 0){
            boolean bool = search(ints,0,0,in.nextInt());
            System.out.printf("%s\n",bool?"yes":"no");
        }
    }
    private static int i ;
    private static int n ;
    private static boolean search(int[] ints,int i,int sum,int key){
        if (key == sum)
            return true;
        if (i == n)
            return false;
        if(search(ints,i+1,sum+ints[i],key))
            return true;
        if (search(ints,i+1,sum,key))
            return true;
        return false;
    }
}

