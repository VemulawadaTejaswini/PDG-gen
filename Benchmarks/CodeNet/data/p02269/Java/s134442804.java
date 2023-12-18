import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        new Main().exe();
    }

    private void exe(){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<String>();

        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            String a = sc.next();
            String str = sc.next();
            switch(a){
                case "insert":
                    hs.add(str);
                    break;

                case "find":
                    System.out.println(hs.contains(str) ? "yes":"no");
                    break;

            }

        }



    }
}
