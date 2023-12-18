import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String word = sc.next();
        String array = "";
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        while(sc.hasNext()){
            array = array + sc.next();
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<array.length();j++){
                if(array.toLowerCase().charAt(j) == alpha.charAt(i)){
                    count++;
                }
            }
            System.out.println(alpha.charAt(i) + " : " + count);
        }
        sc.close();
    }
}
