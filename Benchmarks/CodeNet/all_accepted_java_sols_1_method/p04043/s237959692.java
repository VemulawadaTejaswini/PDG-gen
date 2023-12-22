import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A=scan.nextInt(),B=scan.nextInt(),C=scan.nextInt();
        if((A!=5&&A!=7)||(B!=5&&B!=7)||(C!=5&&C!=7)){
            System.out.println("NO");
        }else if(A+B+C!=17){
             System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
