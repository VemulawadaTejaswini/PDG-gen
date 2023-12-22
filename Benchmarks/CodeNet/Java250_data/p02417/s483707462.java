import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public  static void main(String[] args){
    String c;
    String[] alps = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
             "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
             "w", "x", "y", "z"};
    String[] alpb = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
             "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
             "W", "X", "Y", "Z"};
    int[] cnt = new int[26];
    while(kbd.hasNext()){
        String s = kbd.nextLine();
        int i;
        for(i=0; i<s.length(); i++){
        c = s.substring(i, i+1);
        int j=0;
        while(j<26 && !alps[j].equals(c)) j++;
        if(j<26) cnt[j]++; 
        j=0;
        while(j<26 && !c.equals(alpb[j])) j++;
        if(j<26) cnt[j]++;
        }
    }
    for(int i=0; i<cnt.length; i++){
        System.out.println(alps[i]+" : "+cnt[i]);
    }
    }
}