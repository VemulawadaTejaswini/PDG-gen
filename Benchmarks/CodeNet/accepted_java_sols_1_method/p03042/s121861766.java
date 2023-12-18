import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int a = Integer.valueOf(line.substring(0,2)).intValue();
        int b = Integer.valueOf(line.substring(2,4)).intValue();

        if(a>0 && a<13){
            if(b>0 && b<13){
                System.out.println("AMBIGUOUS");
            }else{
                System.out.println("MMYY");
            }
        }else{
            if(b>0 && b<13){
                System.out.println("YYMM");
            }else{
                System.out.println("NA");
            }
        }

    }
}
