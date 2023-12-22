
import java.util.Scanner;

 class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        char[] str = s.toCharArray();
        str[k-1]+=32;
        //for(int i=0;i<n;i++){

            System.out.print(str);
        //}
    }

}
