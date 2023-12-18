import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String search = sc.next();
        while(true){
            String words = sc.next();
            if(search == words) count++;
            if(words == "END_OF_TEXT") break;
        }
        System.out.printf("%d\n",count);
    }
}

