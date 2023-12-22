import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        //System.out.println(str);
        boolean check = false;

        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 1){
                if(str.charAt(i) != 'L' && str.charAt(i) != 'U' && str.charAt(i) != 'D'){
                    check = false;
                    break;
                }
                else{
                    check = true;
                }
            }
            else{
                if(str.charAt(i) != 'R' && str.charAt(i) != 'U' && str.charAt(i) != 'D'){
                    check = false;
                    break;
                }
                else{
                    check = true;
                }
            }
        }
        if(check == true){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }

    }
}