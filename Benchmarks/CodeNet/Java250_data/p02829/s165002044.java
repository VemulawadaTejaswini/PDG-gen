import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.next());
        int second = Integer.parseInt(scan.next());

        //long input = scan.nextLong();
//        String first = scan.next();
//        String second = scan.next();
        //for (int i = 1; i <=input; i++) {
        //}
        System.out.println((1+2+3)-first-second);
    }
//        int[] input = new int[5];
//        for(int i=0;i<5;i++) {
//            input[i] = Integer.parseInt(scan.next());
//        }
    //int c = Integer.parseInt(scan.next());
//        int cnt = 0;
//        while(h>0) {
//            h = h-a;
//            cnt++;
//        }
//        if(cnt*500 >= total) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        List<Integer> result = new ArrayList<Integer>();
//        for(int i=0;i<input.length; i++) {
//            for(int j=i+1;j<input.length; j++) {
//                for (int k = j+1; k<input.length; k++) {
//                    result.add(i+j+k);
//                }
//            }
//        }
//        Collections.sort(result, Collections.reverseOrder());
//        System.out.println(result.get(2));
       static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
