
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String[] astr = str.split(""); //状況に合わせて
        sc.close();
        Boolean flag = true;

        for(int i=0;i<astr.length;i++){
            if(i%2 == 0){
                flag = check1(astr[i]);
            }
            else{
                flag = check2(astr[i]);
            }
            if(flag == false){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
    public static Boolean check1(String a){
        if(a.equals("R")||a.equals("U")||a.equals("D")){
            return true;
        }else{
            return false;
        }
    }

    public static Boolean check2(String b){
        if(b.equals("L")||b.equals("U")||b.equals("D")){
            return true;
        }else{
            return false;
        }
    }
}