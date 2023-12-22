import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        sc.close();
        int len = s.length;
        boolean ans = true;
        int count = 0;
        for (int i = 0; i < len; i++){
            if(i == 0 ){
                if(s[i] !='A'){
                    ans = false;
                    break;
                }
            }else if(i > 1 && i < len -1 && s[i] == 'C'){
                count += 1;
            }else{
                if(Character.isUpperCase(s[i])){
                    ans = false;
                    break;
                }
            }
        }
        if(count != 1)ans = false;
        if(ans){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }

    }

}
