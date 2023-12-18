import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String YYMM = sc.nextLine();
        int flag = 0;
        int YY = Integer.parseInt(YYMM.substring(0,2));
        int MM = Integer.parseInt(YYMM.substring(2));

        if(YY > 12 || YY < 1){
            flag = -1;
        }
        
        if(MM > 12 || MM < 1){
            if(flag != -1){
                flag += 1;
            }else{
                flag = 2;
            }
        }

        if(YYMM.equals("0000")){
            flag = 2;
        }

        switch(flag){
            case 0:
                System.out.println("AMBIGUOUS");
                break;
            case 1:
                System.out.println("MMYY");
                break;
            case -1:
                System.out.println("YYMM");
                break;
            case 2:
                System.out.println("NA");
                break;
        }
    }
}