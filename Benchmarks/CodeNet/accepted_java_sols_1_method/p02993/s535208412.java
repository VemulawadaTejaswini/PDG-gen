import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String key = s.nextLine();
        for(int i=0;i<key.length();i++){
            if(i==key.length()-1){
                break;
            }
            if(i+1<key.length()&&key.charAt(i+1)!=key.charAt(i)){
                continue;
            }else{
                System.out.println("Bad");
                System.exit(0);
            }
        }
        System.out.println("Good");
    }
}
