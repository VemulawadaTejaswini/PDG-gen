import java.sql.ResultSet;
import java.util.Scanner;
import java.util.stream.Stream;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();

        int sum = Stream.of(n.split("", 0)).mapToInt(e -> Integer.parseInt(e)).sum();
        String result = "No";
        if(sum % 9 == 0){
            result = "Yes";
        }
        System.out.println(result);
    }
}