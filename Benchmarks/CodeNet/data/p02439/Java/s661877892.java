import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();
        //int e = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}

        System.out.println(Math.min(a, Math.min(b, c)) + " " + Math.max(a, Math.max(b, c)));

        //System.out.println();
        //System.out.print();

        stdIn.close();
    }
}

