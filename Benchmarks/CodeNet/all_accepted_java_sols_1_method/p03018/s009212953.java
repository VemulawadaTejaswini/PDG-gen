import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        long count = 0;
        long ans = 0;

//        str = str.replace("BC", "D");

        char c[] = str.toCharArray();

        for (int i=0; i<c.length; i++){
            if (c[i]=='A'){
                count++;
            }
            else if (i+1<c.length && c[i]=='B' && c[i+1]=='C'){
                ans += count;
                i++;
            }
            else {
                count=0;
            }
        }

        System.out.println(ans);

//        while(str.contains("ABC")){
//            str = str.replaceFirst("ABC", "BCA");
//            count++;
//        }
//        System.out.println(count);
    }
}