import java.util.*;
public class Main {
    public static void main(String[] args) {
        String returnFlag ="No";
        Scanner scanner = new Scanner(System.in);
        int totalN = scanner.nextInt();
        int cake4 =0;
        int donut7=0;
        while(donut7*7<=totalN){
            cake4=0;
            while ((donut7*7+cake4*4)<=totalN){
                if(donut7*7+cake4*4==totalN){
                    returnFlag="Yes";
                    break;
                }
                cake4++;
            }
            donut7++;
        }
        System.out.println(returnFlag);
    }
}
