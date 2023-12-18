import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String BRAKEW="END_OF_TEXT";
        int count=0;
        while(true) {
            String str = sc.nextLine();
            str = str.toLowerCase();
            if(str.equals(BRAKEW.toLowerCase()))break;


            if(str.contains(key)) {
            	count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
