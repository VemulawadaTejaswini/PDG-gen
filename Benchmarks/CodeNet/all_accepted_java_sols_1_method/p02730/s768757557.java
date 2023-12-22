import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  moji = sc.nextLine();
        String moji2 = moji.substring(0,(moji.length()-1)/2);
        String moji3 = moji.substring((moji.length()+1)/2,moji.length());

        //System.out.println(moji2);
        //System.out.println(moji3);

        String flag = "No";

        if(moji2.equals(moji3)) flag = "Yes";
        System.out.println(flag);

    }
}