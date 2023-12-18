import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String key = sc.next();

        String read = sc.next();
        while(!(read.equals("END_OF_TEXT"))){
            if(read.equals(key))
                count++;
            read = sc.next();
        }
        System.out.println(count);

        sc.close();
    }
}
