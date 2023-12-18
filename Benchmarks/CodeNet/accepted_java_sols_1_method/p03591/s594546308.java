import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String x=new String(reader.next());
        if (x.length()<4){
            System.out.println("No");

        }
        else {
            if (x.substring(0,4).equals("YAKI")){

                System.out.println("Yes");
            }
            else{
                System.out.println("No");}
        }


    }
}
