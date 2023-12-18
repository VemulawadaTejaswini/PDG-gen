import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        char[] str = s.toCharArray();
        int r_num = 0;
        int w_num = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] == 'R'){
                r_num++;
            }
        }
        int j = 0;
        for(int i = 0; i < str.length; i++){
            if(str[j] == 'W'){
                j++;
                w_num++;
            }
        }
        r_num -= 1;
        if(w_num == 0){
            System.out.println("0");
        }else if(r_num > w_num){
            System.out.println(r_num);
        }else{
            System.out.println(w_num);
        }
    }
}
