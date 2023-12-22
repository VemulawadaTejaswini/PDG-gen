import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W=sc.next();
        int sum=0;
        while(true){
            String H=sc.next();
            if(H.equals("END_OF_TEXT"))break;
            if(H.equalsIgnoreCase(W))sum++;
        }
        System.out.println(sum);
        sc.close();
    } 
}
