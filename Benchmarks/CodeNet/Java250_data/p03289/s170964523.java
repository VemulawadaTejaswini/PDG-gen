import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();

        int flag = 0;
        if(a[0] != 'A'){
            flag++;
        }
        int flag2 = 0;
        for(int i = 1;i<a.length;i++){
            if(Character.isUpperCase(a[i])){
                flag2++;
            }
        }
        if(s.indexOf("C") != s.lastIndexOf("C") || s.indexOf("C") == 0 || s.indexOf("C") == 1 || s.lastIndexOf("C")+1 == s.length()){
            flag++;
        }

        if(flag == 0 && flag2 == 1){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}