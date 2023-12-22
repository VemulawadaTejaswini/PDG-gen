import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        String S=scanner.next();
        String[] sArray=S.split("-");
        if(sArray.length!=2){
            System.out.println("No");
            System.exit(0);
        }
        if(sArray[0].length()==A&&sArray[1].length()==B){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}