import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String b = sc.next();
            char[] a = b.toCharArray();
            for(int i = 0; i < 26; ++i) {
                for(int j = 0; j < a.length; ++j){
                    if('a' <= a[j] && a[j] <= 'z'){
                        if(a[j] == 'z') {
                            a[j] = 'a';
                        }else{
                            ++a[j];
                        }
                    }
                }
                String d = String.valueOf(a);
                if(d.contains("this") || d.contains("that") || d.contains("the") ){
                    System.out.println(d);
                    break;
                }
            }
        }
    }
}