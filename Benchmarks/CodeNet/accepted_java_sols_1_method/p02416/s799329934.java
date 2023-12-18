import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        List<Integer> list = new ArrayList<Integer>();
        while(flag){
            int sum = 0;
            String s = sc.next();
            if(s.equals("0")){
                flag = false;
            }else{
                StringBuffer sb = new StringBuffer(s);
                for(int i=0;i<s.length();i++){                
                    sum = sum + Integer.parseInt(sb.substring(i, i+1));
                }
                list.add(sum);
            }
        }
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}


