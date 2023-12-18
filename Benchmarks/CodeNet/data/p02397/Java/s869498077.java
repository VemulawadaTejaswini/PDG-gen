import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;

        //String[] num = str.split(" ",0);
        //int i = 1;
        while(true){
            str = scan.nextLine();
            String[] num = str.split(" ",0);
            if(Integer.valueOf(num[0]) == 0&&Integer.valueOf(num[1]) == 0){
                break;
            }
            if(Integer.valueOf(num[0]) > Integer.valueOf(num[1])){
                System.out.println(Integer.valueOf(num[1]) + " " + Integer.valueOf(num[0]));
            }else{
                System.out.println(Integer.valueOf(num[0]) + " " + Integer.valueOf(num[1]));
            }
            
        }


        scan.close();
    }

}

