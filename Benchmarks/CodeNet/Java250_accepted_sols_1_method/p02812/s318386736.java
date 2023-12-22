import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int count =0;

        String s =sc.next();
        if(s.length()>N){
            return;
        }
        s.toUpperCase();
        int index = s.indexOf("ABC",0);
        if(index==-1){
            System.out.println(0);
            return;
        }
        while (index!=-1){
            count++;
            index=s.indexOf("ABC",index+2);
        }
        System.out.println(count);
    }
}