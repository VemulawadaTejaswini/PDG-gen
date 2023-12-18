import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        char[] re = str.toCharArray();

        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(re[i])){
                re[i]=Character.toLowerCase(re[i]);
            }else{

                re[i]=Character.toUpperCase(re[i]);
            }
        }

        String ans = new String(re);

        System.out.println(ans);


        scn.close();


    }


}

