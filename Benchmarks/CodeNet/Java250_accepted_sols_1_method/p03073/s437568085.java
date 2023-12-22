import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        
        int count = 0;
        
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                ch[i+1] = (ch[i]=='0')?'1':'0';
                count++;
            }
        }
        
        System.out.println(count);
    }
}
