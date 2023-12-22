
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        int first = Integer.parseInt(str.substring(0, 2));
        int second = Integer.parseInt(str.substring(2, 4));
        //System.out.println(first +" " + second);
        if((first <=12 && first >0) && (second<=12 && second>0))
            System.out.println("AMBIGUOUS");
        else
            if(first <=12 && first >0)
                System.out.println("MMYY");
            else
                if(second<=12 && second>0)
                    System.out.println("YYMM");
                else
                    System.out.println("NA");

    }
}
