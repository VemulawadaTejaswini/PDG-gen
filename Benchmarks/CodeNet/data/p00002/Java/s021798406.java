import java.util.Scanner;

class Main{
    public static void main(String[] a){
        Scanner s = new Scanner(System.in);

        while(s.hasNext()){
            System.out.println(String.valueOf(s.nextInt() + s.nextInt()).length());
        }
    }
}