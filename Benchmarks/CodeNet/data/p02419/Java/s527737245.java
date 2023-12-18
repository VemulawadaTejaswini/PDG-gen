import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String search = sc.next();
        while(true){
            if(search == sc.next()) count++;
            if(sc.next() == "END_OF_TEXT") break;
        }
        System.out.printf("%d\n",count);
    }
}

