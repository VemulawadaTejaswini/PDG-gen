import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String s = in.nextLine();
            if(s.length() == 2){
                System.out.println(s);
            }else{
                for (int i = s.length() - 1; i >= 0; i--) {
                    System.out.print(s.charAt(i));
                }
                System.out.println();
            }
        }
    }
}
