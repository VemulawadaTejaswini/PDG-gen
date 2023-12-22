import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String moji = sc.nextLine();
        boolean flag = false;

        String[] mojiretu = new String[moji.length()];

        for(int i = 0; i<moji.length();i++){
            String moji2 = String.valueOf(moji.charAt(i));
            mojiretu[i] = moji2;
        }

        if(mojiretu[2].equals(mojiretu[3]) && mojiretu[4].equals(mojiretu[5])){
            flag = true;
        }

        if(flag == true){
        System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}