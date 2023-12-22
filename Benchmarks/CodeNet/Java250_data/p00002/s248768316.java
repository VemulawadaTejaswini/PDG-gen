import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a, b;
            a = in.nextInt();
            b = in.nextInt();
            String ret = Integer.toString(a+b);
            System.out.println(ret.length());
        }
    }
}