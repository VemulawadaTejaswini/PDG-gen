import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(sc.next());
        }
        System.out.println(sb.toString().indexOf('Y')>=0?"Four":"Three");
    }

}
