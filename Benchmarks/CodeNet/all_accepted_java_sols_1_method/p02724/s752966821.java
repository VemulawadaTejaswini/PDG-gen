import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int FHY=X/500;
        int FHYR=FHY*500;
        int RY=X-FHYR;
        int FY=RY/5;
        int FHH=FHY*1000;
        int FH=FY*5;
        System.out.println(FHH+FH);
    }
}
