import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //int N = str.length();
        //char[] c = str.toCharArray();
        int count = 0;
        int count0 = 0;
        int count1 = 0;
        boolean test = true;
        
        //while(test && str.length()>1){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0'){
                count0++;
                //System.out.println(0+":"+count0);
            }else{
                count1++;
                //System.out.println(1+":"+count1);
            }
        }
        if(count0<count1){
            count = count0;
        }else{
            count = count1;
        }
        //}
        System.out.println(count*2);
    }
}