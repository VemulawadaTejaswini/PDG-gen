import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String p = scan.next();
        String judge = "No";
        
        List<Integer> s_markList = new ArrayList<Integer>();


        for (int i = 0; i < s.length(); i++) {
            if(p.charAt(0) == s.charAt(i)){
                s_markList.add(i);
            }
        }
        
   
        Iterator<Integer> it = s_markList.iterator();
        while(it.hasNext()){
            Integer e =it.next();
            String ss = s;
            if(p.length() > s.length()-e){
                ss = s + s;
             
            }
            int f = 0;
          
            for(int i = e; i < e + p.length(); i++){
             
                if(ss.charAt(i) == p.charAt(f)){

                    if(f == p.length()-1){
    
                        judge = "Yes";
                        break;
                    }

                    f++;
                }else{
                    break;
                }
            }
        }
        
        System.out.println(judge);
        
    }
}

