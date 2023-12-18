import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=  sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        left.addLast(array[array.length-1]);
        right.addLast(array[array.length-2]);
        boolean isLeft =  true;
        int res = array[array.length-1];
        for (int i = array.length -3; 0 <= i ; i--) {
            int l = left.peekLast();
            int r = right.peekLast();
            int val = Math.min(l, r);
            res += val;
            if(isLeft){
                left.addLast(array[i]);
            }else{
                right.addLast(array[i]);
            }
            isLeft = !isLeft;
        }
        System.out.println(res);
    }
}

