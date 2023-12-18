import java.util.Scanner;
import java.util.Stack;

public class Main {

    static class Pair
    {
        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }


    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        Stack<Pair> s2 = new Stack<Pair>();
        char[] ss = new char[s.length()];
        s.getChars(0,s.length(),ss,0);

        for(int i = 0;i < ss.length;i++)
        {
            if('\\' == ss[i])
            {
                s1.push(i);
            }
            else if('/' == ss[i] && s1.size() > 0)
            {
                int j = s1.pop();
                int tmp = i - j;
                sum += tmp;
                while(s2.size() > 0 && s2.peek().getKey() > j )
                {
                    tmp += s2.peek().getValue();
                    s2.pop();
                }
                s2.push(new Pair(j,tmp));
            }
        }

        System.out.println(sum);
        while(!s2.isEmpty())
        {
            s3.push(s2.pop().getValue());
        }
        System.out.print(s3.size());
        while (!s3.isEmpty())
        {
            System.out.print(" " + s3.pop());
        }
        System.out.println();
    }
}

