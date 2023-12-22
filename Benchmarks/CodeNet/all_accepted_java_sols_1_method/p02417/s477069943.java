import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        while(sc.hasNext()){
        a=a+sc.nextLine();
        }
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String s = a.toLowerCase();
        int[] lst = new int[26];
        
        char x;
        for(int i=0;i<s.length();i++){
            x=s.charAt(i);
            for(int j=0;j<26;j++){
                if(x==alpha.charAt(j))lst[j]+=1;
            }
        }
        for(int i=0;i<26;i++){
            System.out.printf("%s : %d\n",alpha.charAt(i),lst[i]);
        }
    }
}
