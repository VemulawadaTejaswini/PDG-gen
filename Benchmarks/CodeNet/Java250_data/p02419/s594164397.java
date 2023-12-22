import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String target=scan.next();
        String s;
        int ans=0;
        while(true){
            s=scan.next();
            if(s.equals("END_OF_TEXT")){
                break;
            }
            else{
                if(s.equalsIgnoreCase(target)){
                    ans++;
                }
            }
        }
        System.out.println(ans);
        scan.close();
    }
}