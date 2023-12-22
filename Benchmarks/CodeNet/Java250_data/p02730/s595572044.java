import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String kaibun = sc.next();
        int len = kaibun.length();
        String kaibun1 = kaibun.substring(0,(len - 1)/2);
        String kaibun2 = kaibun.substring((len + 3)/2 - 1,len);

        StringBuffer kaibun4 = new StringBuffer(kaibun1);
        String kaibun3 = kaibun4.reverse().toString();

        StringBuffer kaibun5 = new StringBuffer(kaibun2);
        String kaibun6 = kaibun5.reverse().toString();

        StringBuffer kaibun7 = new StringBuffer(kaibun);
        String kaibun8 = kaibun7.reverse().toString();

        if(kaibun3.equals(kaibun1) && kaibun6.equals(kaibun2) && kaibun8.equals(kaibun)){
            System.out.println("Yes");
} else{
            System.out.println("No");
}
}
}