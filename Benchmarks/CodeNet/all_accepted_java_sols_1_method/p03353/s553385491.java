import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
        int K = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();

        for(int i=1; i<=K; i++){
            if(i>s.length()){
                break;
            }
            for(int j=0; j<=s.length()-i; j++){
                if(j<s.length()-i && !list.contains(s.substring(j, j+i))){
                    list.add(s.substring(j, j + i));
                }
                else if(j==s.length()-i && !list.contains(s.substring(j))){
                    list.add(s.substring(j));
                }
            }
        }

        Collections.sort(list);

        System.out.println(list.get(K - 1));
    }
}