import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        long S = stdIn.nextLong();

        long h = S/3600;
        long m = S%3600/60;
        long sec = S%60;

        System.out.println(h+"h"+m+"m"+sec+"s");
    }
}