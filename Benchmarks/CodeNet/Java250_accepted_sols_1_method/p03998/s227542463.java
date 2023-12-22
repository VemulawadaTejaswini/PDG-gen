import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[3];
        int[] cnt = new int[3]; 
        int i,j=0;
        for(i=0;i<3;i++) array[i] = sc.next();
        while(true){
            if(cnt[j]==array[j].length()){
                System.out.println((char)(j+'A'));
                break;
            }
            j = array[j].charAt(cnt[j]++)-'a';
        }
    }
}
